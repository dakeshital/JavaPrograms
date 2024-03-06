package oopsconceptprograms;

class BankAccount {
	private String accountNumber;
	private double balance;

	// constructor
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance!");
		}
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("1234567890", 1000.0);

		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Initial Balance: " + account.getBalance());

		account.setBalance(1500.0);
		System.out.println("Updated Balance after setting: " + account.getBalance());

		account.deposit(500.0);
		System.out.println("Updated Balance after deposit: " + account.getBalance());

		account.withdraw(200.0);
		System.out.println("Updated Balance after withdrawal: " + account.getBalance());
		
		account.withdraw(2000.0);
		System.out.println("Updated Balance after withdrawal: " + account.getBalance());

	}
}
