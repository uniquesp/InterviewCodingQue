package LinkedList;

class CircularLinkedList<T> {
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
			newNode.next = head;
		} else {
			Node<T> current = head;
			while (current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
		}
	}

	// Delete an element
	public void delete(T data) {
		if (head == null)
			return;

		if (head.data.equals(data)) {
			if (head.next == head) {
				head = null;
			} else {
				Node<T> current = head;
				while (current.next != head) {
					current = current.next;
				}
				current.next = head.next;
				head = head.next;
			}
			return;
		}

		Node<T> current = head;
		while (current.next != head && !current.next.data.equals(data)) {
			current = current.next;
		}

		if (current.next != head) {
			current.next = current.next.next;
		}
	}

	// Traverse the circular linked list
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> current = head;
		do {
			System.out.print(current.data + " -> ");
			current = current.next;
		} while (current != head);
		System.out.println("(head)");
	}
}

public class CircularLinkedListDemo {
	public static void main(String[] args) {
		CircularLinkedList<Integer> list = new CircularLinkedList<>();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.display(); // 10 -> 20 -> 30 -> (head)
		list.delete(20);
		list.display(); // 10 -> 30 -> (head)
	}
}
