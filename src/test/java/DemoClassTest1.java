import org.junit.Test;

public class DemoClassTest1 {

    private final int SleepTime = 5 * 1000;
    private DemoClass1 dc = new DemoClass1();
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