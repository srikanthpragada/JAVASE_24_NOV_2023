package oop1;

class SavingsAccount {
	private String acno, customer;
	private double balance;

	public SavingsAccount(String acno, String customer) {
		this.acno = acno;
		this.customer = customer;
	}

	public SavingsAccount(String acno, String customer, double balance) {
		this(acno, customer); // call another constructor
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if(this.balance >= amount)
		   this.balance -= amount;
		else
			throw new IllegalArgumentException("Insufficient Balance");
			
	}

	public double getBalance() {
		return this.balance;
	}
}

public class TestSavingsAccount {

	public static void main(String[] args) {
		var s1 = new SavingsAccount("123", "Dave");
		s1.deposit(10000);
		s1.withdraw(20000);
		s1.deposit(5000);
		System.out.println(s1.getBalance());

		var s2 = new SavingsAccount("126", "Jack", 50000);
		System.out.println(s2.getBalance());

	}

}
