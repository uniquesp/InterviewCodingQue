package Interfaces;

import java.util.*;

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student other) {
		// Compare by age (ascending order)
		return this.age - other.age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

public class ComparableExample { // Changed class name from Comparable to ComparableExample
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 25));
		students.add(new Student("Bob", 20));
		students.add(new Student("Charlie", 22));

		Collections.sort(students); // Sort using Comparable (by age)

		for (Student student : students) {
			System.out.println(student);
		}
	}
}
