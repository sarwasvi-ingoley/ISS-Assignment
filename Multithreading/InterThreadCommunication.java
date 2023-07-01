class Q {
    int num;
    boolean valueSet=false;
    public synchronized void put(int num) {
        while (valueSet) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Put: " + num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get() {
        while (!valueSet) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Get: " + num);
        valueSet=false;
        notify();
    }
}
class Producer implements Runnable { // puts value
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable { // gets value
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
