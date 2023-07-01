public class ThreadPriority {
    public static void main(String[] args) throws Exception{
        Runnable hiRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi" + Thread.currentThread().getPriority());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                        System.out.println(ie);
                    }
                }
            }
        };
        Thread t1 = new Thread(hiRunnable);
        Thread t2 = new Thread(() -> { // lambda
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        });
        //t1.setName("HiThread");
        t2.setName("HelloThread");
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        t2.start();
        System.out.println(t1.isAlive());
        String s1 = t1.getName();
        System.out.println(t2.getPriority());
        t1.join();
        t2.join();
        System.out.println("Bye");
        System.out.println("s1: " + s1);
        System.out.println(t1.isAlive());
    }
}

