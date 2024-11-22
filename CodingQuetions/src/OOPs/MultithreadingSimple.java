package OOPs;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}

public class MultithreadingSimple {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		thread1.start(); // Start thread1
		thread2.start(); // Start thread2
	}
}
