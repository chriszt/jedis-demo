package pkg;

import org.junit.Before;
import org.junit.Test;

public class TxTaskTest {

    private TxTask txTask;

    private String host;
    private int port;

    @Before
    public void init() {
        host = "localhost";
        port = 6379;

        txTask = new TxTask(host, port);
    }

    @Test
    public void testTask1() {
        txTask.task1();
    }

}
