package Stack;

import java.util.EmptyStackException;

class Stack<T> {
	private Node<T> top;
	private int size;

	private static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	// Push method: Adds an element to the stack
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = top;
		top = newNode;
		size++;
		System.out.println(data + " pushed to stack");
	}

	// Pop method: Removes the top element from the stack
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T data = top.data;
		top = top.next;
		size--;
		System.out.println(data + " popped from stack");
		return data;
	}

	// Peek method: Returns the top element without removing it
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	// isEmpty method: Checks if the stack is empty
	public boolean isEmpty() {
		return top == null;
	}

	// size method: Returns the number of elements in the stack
	public int size() {
		return size;
	}

	// clear method: Clears the stack
	public void clear() {
		top = null;
		size = 0;
		System.out.println("Stack cleared");
	}
}

public class StackImplementation {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		// Push elements
		stack.push(10);
		stack.push(20);
		stack.push(30);

		// Peek at the top element
		System.out.println("Top element is: " + stack.peek());

		// Pop elements
		stack.pop();
		stack.pop();

		// Check if the stack is empty
		System.out.println("Is stack empty? " + stack.isEmpty());

		// Push another element
		stack.push(40);

		// Get stack size
		System.out.println("Stack size: " + stack.size());

		// Clear the stack
		stack.clear();
		System.out.println("Is stack empty after clear? " + stack.isEmpty());
	}

}
