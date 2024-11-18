package OOPs;

class Person {
	// Private fields
	private String name;
	private int age;

	// Constructor to initialize fields
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int age) {
		if (age > 0) { // Adding validation
			this.age = age;
		} else {
			System.out.println("Age must be positive.");
		}
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		// Create a Person object
		Person person = new Person("John", 25);

		// Access and modify fields using getter and setter methods
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());

		// Update fields using setters
		person.setName("Doe");
		person.setAge(30);

		// Display updated information
		System.out.println("Updated Name: " + person.getName());
		System.out.println("Updated Age: " + person.getAge());

		// Attempt to set an invalid age
		person.setAge(-5); // Will trigger validation in setter
	}
}
