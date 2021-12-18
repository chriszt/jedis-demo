package pkg;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.List;

public class TxTask {

    private String host;

    private int port;

    public TxTask(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void task1() {
        Jedis cli = new Jedis(host, port);

        Transaction tx = cli.multi();
        for (int i = 1; i <= 3; i++) {
            Response<String> resp = tx.set("k" + i, "v" + i);
            System.out.println(resp);
        }

        List<Object> execLst = tx.exec();
        for (Object o : execLst) {
            System.out.println(o);
        }
    }

}
