package pkg;

import org.junit.Before;
import org.junit.Test;

public class StringTaskTest {

    private StringTask strTask;

    private String host;
    private int port;

    @Before
    public void init() {
        host = "localhost";
        port = 6379;

        strTask = new StringTask(host, port);
    }

    @Test
    public void testTask1() {
        strTask.task1();
    }

    @Test
    public void testTask2() {
        strTask.task2();
    }

    @Test
    public void testTask3() {
        String key = "aaa";
        String val = "111";
        strTask.task3(key, val);
    }

    @Test
    public void testTask4() {
        String key = "aaa";
        String appVal = "222";
        strTask.task4(key, appVal);
    }

}
