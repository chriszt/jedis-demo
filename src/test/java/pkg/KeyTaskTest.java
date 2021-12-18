package pkg;

import org.junit.Before;
import org.junit.Test;

public class KeyTaskTest {

    private KeyTask keyTask;

    private String host;
    private int port;

    @Before
    public void init() {
        host = "localhost";
        port = 6379;

        keyTask = new KeyTask(host, port);
    }

    @Test
    public void testTask1() {
        keyTask.task1();
    }

    @Test
    public void testTask2() {
        keyTask.task2();
    }

    @Test
    public void testTask3() {
        keyTask.task3();
    }

    @Test
    public void testTask4() {
        keyTask.task4(0, "k1", 1);
    }

}
