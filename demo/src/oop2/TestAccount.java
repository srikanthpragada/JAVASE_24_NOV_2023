package oop2;

interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements AccountOperations {
    private String customer;
    private double balance; 
    
    
	@Override
	public void deposit(double amount) {
		 this.balance  += amount;
		
	}

	@Override
	public void withdraw(double amount) {
		 this.balance  -= amount;
	}

	@Override
	public double getBalance() {
		 return this.balance;
	}
}

public class TestAccount {
	public static void main(String[] args) {


	}
}
