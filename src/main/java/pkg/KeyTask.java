package pkg;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class KeyTask {

    private String host;

    private int port;

    public KeyTask(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void task1() {
        Jedis cli = new Jedis(host, port);

        String ret = cli.ping();
        System.out.println(ret);
    }

    public void task2() {
        Jedis cli = new Jedis(host, port);

        Set<String> keys = cli.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }

    public void task3() {
        Jedis cli = new Jedis(host, port);

        boolean bRet = cli.exists("k1");
        System.out.println(bRet);
        bRet = cli.exists("k2");
        System.out.println(bRet);

        long lRet = cli.exists("k1", "k2", "k3");
        System.out.println(lRet);
    }

    public void task4(int srcDb, String key, int dstDb) {
        Jedis cli = new Jedis(host, port);

        String strRet = cli.select(srcDb);
        System.out.println(strRet);

        Long lRet = cli.move("k1", dstDb);
        System.out.println(lRet);
    }

}
