package concurrency;

public class PrintThird implements Runnable{

    @Override
    public void run() {
        System.out.println("Third");
    }
}
