import org.junit.Test;

import static org.junit.Assert.*;

public class DemoClassTest3 {

    private final int SleepTime = 5 * 1000;
    private DemoClass3 dc = new DemoClass3();
    @Test
    public void callOkTest1() throws InterruptedException {
        dc.call1();
        Thread.sleep(SleepTime);
    }

    @Test
    public void callOkTest2() throws InterruptedException {
        dc.call1();
        Thread.sleep(SleepTime);

    }

    @Test
    public void callOkTest3() throws InterruptedException {
        dc.call1();
        Thread.sleep(SleepTime);
    }

}