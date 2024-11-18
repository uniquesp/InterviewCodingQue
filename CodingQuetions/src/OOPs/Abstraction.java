package OOPs;

// Abstract class
abstract class Payment {
	private double amount;

	public Payment(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public abstract void processPayment();
}

// Concrete class for Credit Card Payment
class CreditCardPayment extends Payment {
	private String cardNumber;

	public CreditCardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment of $" + getAmount() + " using card number " + cardNumber);
	}
}

// Concrete class for PayPal Payment
class PayPalPayment extends Payment {
	private String email;

	public PayPalPayment(double amount, String email) {
		super(amount);
		this.email = email;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment of $" + getAmount() + " using email " + email);
	}
}

// Main class
public class Abstraction {
	public static void main(String[] args) {
		Payment creditCardPayment = new CreditCardPayment(150.00, "1234-5678-9012-3456");
		creditCardPayment.processPayment();

		Payment payPalPayment = new PayPalPayment(75.50, "user@example.com");
		payPalPayment.processPayment();
	}
}
