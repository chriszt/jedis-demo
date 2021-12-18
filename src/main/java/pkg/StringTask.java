package pkg;


import redis.clients.jedis.Jedis;

public class StringTask {

    private String host;

    private int port;

    public StringTask(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void task1() {
        Jedis cli = new Jedis(host, port);
        String ret = cli.flushAll();
        System.out.println(ret);
    }

    public void task2() {
        Jedis cli = new Jedis(host, port);
        String ret;
        for (int i = 1; i <= 10000; i++) {
            ret = cli.setex("key" + i, i, "value" + i);
            System.out.println("ret: " + i);
        }
    }

    public void task3(String key, String val) {
        Jedis cli = new Jedis(host, port);
        String ret = cli.set(key, val);
        System.out.println(ret);
    }

    public void task4(String key, String appVal) {
        Jedis cli = new Jedis(host, port);
        Long ret = cli.append(key, appVal);
        System.out.println(ret);
    }

}
