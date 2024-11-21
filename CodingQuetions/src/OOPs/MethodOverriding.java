package OOPs;

public class MethodOverriding {
	static class Employee {
		double baseSalary;

		public Employee(double baseSalary) {
			this.baseSalary = baseSalary;
		}

		public double calculateSalary() {
			return baseSalary;
		}
	}

	static class Manager extends Employee {
		double bonus;

		public Manager(double baseSalary, double bonus) {
			super(baseSalary);
			this.bonus = bonus;
		}

		@Override
		public double calculateSalary() {
			return baseSalary + bonus;
		}
	}

	public static void main(String[] args) {
		Employee emp = new Employee(50000);
		Manager mgr = new Manager(50000, 10000);

		System.out.println("Employee Salary: " + emp.calculateSalary());
		System.out.println("Manager Salary: " + mgr.calculateSalary());
	}
}
