package OOPs;

class A {
	int i;

	A() {
		i = 10; // Default value for demonstration
	}

	A(int i) {
		this.i = i;
	}

	void display() {
		System.out.println("A");
	}
}

class B extends A {
	int j;

	B() {
		j = 20;
	}

	B(int j) {
		this.j = j;
	}

	@Override
	void display() {
		System.out.println("B");
	}
}

public class TestClass {
	public static void main(String[] args) {
		A obj = new B(); // Upcasting
	//	B obj1 = new A();
		// System.out.println(obj.j); // Error: j is not accessible
		System.out.println(obj.i); // Output: 10 (from A's default constructor)
		obj.display(); // Output: B (dynamic method dispatch)
	}
}
