package concurrency;

public class PrintSecond implements Runnable {
    @Override
    public void run() {
        System.out.println("Second");
    }
}
