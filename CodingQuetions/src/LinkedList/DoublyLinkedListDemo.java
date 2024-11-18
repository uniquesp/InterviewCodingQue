package LinkedList;

class DoublyLinkedList<T> {
	private Node<T> head;

	private static class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;

		Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
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
			newNode.prev = current;
		}
	}

	// Delete an element
	public void delete(T data) {
		if (head == null)
			return;

		if (head.data.equals(data)) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			}
			return;
		}

		Node<T> current = head;
		while (current != null && !current.data.equals(data)) {
			current = current.next;
		}

		if (current != null) {
			if (current.next != null) {
				current.next.prev = current.prev;
			}
			if (current.prev != null) {
				current.prev.next = current.next;
			}
		}
	}

	// Traverse the list forward
	public void displayForward() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> current = head;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.next;
		}
		System.out.println("null");
	}

	// Traverse the list backward
	public void displayBackward() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.prev;
		}
		System.out.println("null");
	}
}

public class DoublyLinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.displayForward(); // 10 <-> 20 <-> 30 <-> null
		list.delete(20);
		list.displayForward(); // 10 <-> 30 <-> null
		list.displayBackward(); // 30 <-> 10 <-> null
	}
}
