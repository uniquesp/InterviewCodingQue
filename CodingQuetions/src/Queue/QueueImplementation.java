package Queue;

class Queue<T> {
	private Node<T> front, rear;
	private int size;

	private static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	// Enqueue method: Adds an element to the rear of the queue
	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
		System.out.println(data + " added to the queue");
	}

	// Dequeue method: Removes an element from the front of the queue
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		T data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		System.out.println(data + " removed from the queue");
		return data;
	}

	// Peek method: Returns the front element without removing it
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return front.data;
	}

	// isEmpty method: Checks if the queue is empty
	public boolean isEmpty() {
		return front == null;
	}

	// size method: Returns the number of elements in the queue
	public int size() {
		return size;
	}

	// clear method: Clears the queue
	public void clear() {
		front = rear = null;
		size = 0;
		System.out.println("Queue cleared");
	}
}

public class QueueImplementation {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();

		// Enqueue elements
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		// Peek at the front element
		System.out.println("Front element is: " + queue.peek());

		// Dequeue elements
		queue.dequeue();
		queue.dequeue();

		// Check if the queue is empty
		System.out.println("Is queue empty? " + queue.isEmpty());

		// Enqueue another element
		queue.enqueue(40);

		// Get queue size
		System.out.println("Queue size: " + queue.size());

		// Clear the queue
		queue.clear();
		System.out.println("Is queue empty after clear? " + queue.isEmpty());
	}
}
