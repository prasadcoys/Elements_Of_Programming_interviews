package concurrency;

public class PrintFirst implements Runnable{
    @Override
    public void run() {
        System.out.println("First");
    }
}
