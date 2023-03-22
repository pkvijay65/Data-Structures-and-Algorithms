class FooBar {
    private int n;
    private Semaphore fooPrintSemaphore = new Semaphore(1);
    private Semaphore barPrintSemaphore = new Semaphore(0);
    
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            fooPrintSemaphore.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            barPrintSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            barPrintSemaphore.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            fooPrintSemaphore.release();
        }
    }
}