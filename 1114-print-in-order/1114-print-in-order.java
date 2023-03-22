class Foo {
    private Semaphore secondPrintSemaphore = new Semaphore(0);
    private Semaphore thirdPrintSemaphore = new Semaphore(0);
    
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
         secondPrintSemaphore.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
         secondPrintSemaphore.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        thirdPrintSemaphore.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        thirdPrintSemaphore.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}