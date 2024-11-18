package OOPs;

// Custom Exception Class
class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message) {
		super(message);
	}
}

// BankAccount Class
class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException(
					"Insufficient funds. You tried to withdraw: " + amount + ", but your balance is: " + balance);
		} else {
			balance -= amount;
			System.out.println("Withdrawal successful! New balance: " + balance);
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class ExceptionHandeling {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(5000); // Initial balance of 5000

		try {
			System.out.println("Attempting to withdraw 6000...");
			account.withdraw(6000); // This will cause an InsufficientFundsException
		} catch (InsufficientFundsException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Transaction complete. Final balance: " + account.getBalance());
		}

		try {
			System.out.println("\nAttempting to withdraw 3000...");
			account.withdraw(3000); // Valid withdrawal
		} catch (InsufficientFundsException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Transaction complete. Final balance: " + account.getBalance());
		}
	}
}
