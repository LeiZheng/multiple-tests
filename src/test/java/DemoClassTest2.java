import org.junit.Test;

public class DemoClassTest2 {

    private final int SleepTime = 5 * 1000;
    private DemoClass2 dc = new DemoClass2();
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