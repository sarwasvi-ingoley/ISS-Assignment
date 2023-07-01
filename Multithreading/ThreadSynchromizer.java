class Counter {
    int count=0;
    public synchronized void increment() { //method synch
        count++; // count = count + 1; by the time one thread is adding the value the other thread fetches the value. 2 threads are manipulating the same value
    }
}
public class ThreadSynchromizer {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    c.increment();
                    System.out.println("Thread: "+Thread.currentThread().getName()+" Count: " + c.count);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    c.increment();
                    System.out.println("Thread: "+Thread.currentThread().getName()+" Count: " + c.count);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count Value: "+c.count);
    }
}


