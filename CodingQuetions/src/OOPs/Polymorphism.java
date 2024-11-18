package OOPs;

//Parent Class
abstract class Vehicle {
	public abstract void move(); // Abstract method for movement
}

//Child Class 1: Car
class Car extends Vehicle {
	@Override
	public void move() {
		System.out.println("Car moves on roads.");
	}
}

//Child Class 2: Bicycle
class Bicycle extends Vehicle {
	@Override
	public void move() {
		System.out.println("Bicycle moves on bike lanes.");
	}
}

//Child Class 3: Train
class Train extends Vehicle {
	@Override
	public void move() {
		System.out.println("Train moves on tracks.");
	}
}

//Main Class

public class Polymorphism {
	public static void main(String[] args) {
		Vehicle vehicle; // Parent reference

		// Polymorphism in action
		vehicle = new Car();
		vehicle.move(); // Outputs: Car moves on roads.

		vehicle = new Bicycle();
		vehicle.move(); // Outputs: Bicycle moves on bike lanes.

		vehicle = new Train();
		vehicle.move(); // Outputs: Train moves on tracks.
	}
}
