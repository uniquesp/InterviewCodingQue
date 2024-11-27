package LinkedList;

class SinglyLinkedList<T> {
	private Node<T> head;

	private static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	// Insert element at the end
	public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void insertatPos(T data, int pos) {
		Node<T> newNode = new Node<>(data);
		if (pos < 0) {
			System.out.println("Invalid position!");
			return;
		}

		if (pos == 0) { // Insert at the head
			newNode.next = head;
			head = newNode;
			return;
		}

		Node<T> current = head;
		int i = 0;
		while (current != null && i < pos - 1) { // Traverse to the node before the target position
			current = current.next;
			i++;
		}
		if (current == null) { // Position out of bounds
			System.out.println("Position out of bounds!");
			return;
		}
		newNode.next = current.next;
		current.next = newNode;

	}

	// Delete an element
	public void delete(T data) {
		if (head == null)
			return;

		if (head.data.equals(data)) {
			head = head.next;
			return;
		}

		// Traverse the list to find the node before the one to be deleted
		Node<T> current = head;
		while (current.next != null) {
			if (current.next.data.equals(data)) {
				current.next = current.next.next; // Bypass the node to delete it
				return;
			}
			current = current.next;
		}
	}

	public void deleteFromPos(int pos) {
		if (pos < 0 || head == null) { // Invalid position or empty list
			System.out.println("Invalid position or list is empty!");
			return;
		}
		if (pos == 0) { // Deleting the head
			head = head.next;
			return;
		}
		Node<T> current = head;
		int i = 0;
		// Traverse to the node before the target position
		while (current != null && i < pos - 1) {
			current = current.next;
			i++;
		}
		if (current == null || current.next == null) { // Position out of bounds
			System.out.println("Position out of bounds!");
			return;
		}
		// Delete the node by skipping it
		current.next = current.next.next;
	}

	// Traverse the list
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

public class SinglyLinkedListDemo {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insertatPos(80, 2);
		System.out.println("Original List:");
		list.display(); // Output: 10 -> 20 -> 30 -> 40 -> null

		list.deleteFromPos(2); // Delete element at position 2
		System.out.println("After deleting position 2:");
		list.display(); // Output: 10 -> 20 -> 40 -> null

		list.deleteFromPos(0); // Delete the head
		System.out.println("After deleting position 0:");
		list.display(); // Output: 20 -> 40 -> null

		list.deleteFromPos(5); // Position out of bounds
		System.out.println("After attempting invalid position:");
		list.display();
	}
}
