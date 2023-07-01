class ThreadRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable Thread: "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);		
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

class MyThread extends Thread{
	MyThread() {}
	MyThread(String ThreadName) {
		super(ThreadName);
	}
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread: "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);		
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
public class ThreadExample {
	public static void main(String[] args) {
		Thread threadRunnableObj1 = new Thread(new ThreadRunnable(), "threadRunnableObj1");
		Thread threadRunnableObj2 = new Thread(new ThreadRunnable(), "threadRunnableObj2");
		System.out.println("Runnable Threads");
		threadRunnableObj1.start();
		threadRunnableObj2.start();
		System.out.println("MyThreads");
		Thread myThreadObj1 = new MyThread();
		Thread myThreadObj2 = new MyThread("myThreadObj2");
		myThreadObj1.start();
		myThreadObj2.start();
		
	}
}
