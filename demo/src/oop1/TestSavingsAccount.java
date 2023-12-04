package oop1;

class SavingsAccount  {
	private String acno, customer;
	private double balance;
	
	public SavingsAccount(String ano, String cname) {
		acno = ano;
		customer = cname;
	}

	public SavingsAccount(String ano, String cname, double bal) {
		acno = ano;
		customer = cname;
		balance = bal;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
public class TestSavingsAccount {

	public static void main(String[] args) {
		 var s1 = new SavingsAccount("123", "Dave");
	     s1.deposit(10000);
	     s1.withdraw(2000);
	     s1.deposit(5000);
	     System.out.println(s1.getBalance());
	     
	     var s2 = new SavingsAccount("126", "Jack", 50000);
	     System.out.println(s2.getBalance());

	}

}
