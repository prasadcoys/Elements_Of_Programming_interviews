package concurrency;

class FooBar {
    private int n;
    private boolean odd = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(this){
                if (!odd){
                    wait();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                odd = false;
                notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            synchronized(this){
                if (!odd){
                    wait();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printBar.run();
                odd = false;
                notifyAll();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.

        }
    }
}
