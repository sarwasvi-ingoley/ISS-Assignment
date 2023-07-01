class Hi extends Thread{ // Hi is a thread now
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Hello extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main");
        new Hi().start();
        new Hello().start();
    }
}
