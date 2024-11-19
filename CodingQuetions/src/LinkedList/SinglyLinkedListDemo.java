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
		list.display(); // 10 -> 20 -> 30 -> null
		list.delete(20);
		list.display(); // 10 -> 30 -> null
	}
}
