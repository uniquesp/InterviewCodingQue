package OOPs;

//Shared Resource: Order Queue
class OrderQueue {
	private boolean orderReady = false;

	public synchronized void prepareOrder() throws InterruptedException {
		while (orderReady) {
			wait(); // Wait until the order is taken
		}
		System.out.println(Thread.currentThread().getName() + " is preparing an order...");
		Thread.sleep(1000); // Simulate time to prepare order
		orderReady = true;
		System.out.println(Thread.currentThread().getName() + " has prepared the order.");
		notifyAll(); // Notify that order is ready
	}

	public synchronized void takeOrder() throws InterruptedException {
		while (!orderReady) {
			wait(); // Wait until the order is ready
		}
		System.out.println(Thread.currentThread().getName() + " is taking the order...");
		Thread.sleep(500); // Simulate time to take the order
		orderReady = false;
		notifyAll(); // Notify that order is taken
	}
}

//Thread: Chef
class Chef extends Thread {
	private OrderQueue orderQueue;

	public Chef(String name, OrderQueue queue) {
		super(name);
		this.orderQueue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) { // Prepare 3 orders
				orderQueue.prepareOrder();
				Thread.yield(); // Allow other threads to run
			}
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interrupted.");
		}
	}
}

//Thread: Waiter
class Waiter extends Thread {
	private OrderQueue orderQueue;

	public Waiter(String name, OrderQueue queue) {
		super(name);
		this.orderQueue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) { // Take 3 orders
				orderQueue.takeOrder();
			}
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interrupted.");
		}
	}
}

//Thread: Cleaner (Daemon Thread)
class Cleaner extends Thread {
	public Cleaner() {
		setDaemon(true); // Set as a daemon thread
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Cleaner is cleaning the kitchen...");
				Thread.sleep(2000); // Simulate cleaning
			} catch (InterruptedException e) {
				System.out.println("Cleaner interrupted.");
			}
		}
	}
}

public class Multithreading {
	public static void main(String[] args) throws InterruptedException {
		OrderQueue orderQueue = new OrderQueue();

		// Create threads
		Chef chef1 = new Chef("Chef 1", orderQueue);
		Chef chef2 = new Chef("Chef 2", orderQueue);
		Waiter waiter1 = new Waiter("Waiter 1", orderQueue);
		Waiter waiter2 = new Waiter("Waiter 2", orderQueue);

		// Daemon thread
		Cleaner cleaner = new Cleaner();
		System.out.println("Cleaner is daemon: " + cleaner.isDaemon());
		cleaner.start();

		// Start threads
		chef1.start();
		chef2.start();
		waiter1.start();
		waiter2.start();

		// Wait for threads to finish
		chef1.join();
		chef2.join();
		waiter1.join();
		waiter2.join();

		System.out.println("All tasks are complete. Kitchen is closed!");
	}
}
