package OOPs;

class OrderQueue {
    private boolean orderReady = false;

    public synchronized void prepareOrder() throws InterruptedException {
        while (orderReady) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " is preparing an order...");
        Thread.sleep(1000);
        orderReady = true;
        System.out.println(Thread.currentThread().getName() + " has prepared the order.");
        notifyAll();
    }

    public synchronized void takeOrder() throws InterruptedException {
        while (!orderReady) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " is taking the order...");
        Thread.sleep(500);
        orderReady = false;
        notifyAll();
    }
}

class Chef extends Thread {
    private OrderQueue orderQueue;

    public Chef(String name, OrderQueue queue) {
        super(name);
        this.orderQueue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                orderQueue.prepareOrder();
                Thread.yield();
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

class Waiter extends Thread {
    private OrderQueue orderQueue;

    public Waiter(String name, OrderQueue queue) {
        super(name);
        this.orderQueue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                orderQueue.takeOrder();
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

class Cleaner extends Thread {
    public Cleaner() {
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Cleaner is cleaning the kitchen...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Cleaner interrupted.");
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        OrderQueue orderQueue = new OrderQueue();

        Chef chef1 = new Chef("Chef 1", orderQueue);
        Chef chef2 = new Chef("Chef 2", orderQueue);
        Waiter waiter1 = new Waiter("Waiter 1", orderQueue);
        Waiter waiter2 = new Waiter("Waiter 2", orderQueue);

        Cleaner cleaner = new Cleaner();
        cleaner.start();

        chef1.start();
        chef2.start();
        waiter1.start();
        waiter2.start();

        chef1.join();
        chef2.join();
        waiter1.join();
        waiter2.join();

        System.out.println("All tasks are complete. Kitchen is closed!");
    }
}
