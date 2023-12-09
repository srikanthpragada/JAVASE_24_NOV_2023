package oop1;

abstract class Employee {
	private String name;
	protected int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name);  // compile-time polymoprhism 
		System.out.println(this.salary);
	}
	
	public abstract int getSalary();
}

class Manager extends Employee {
	private int hra;

	public Manager(String name, int salary, int hra) {
		super(name, salary);
		this.hra = hra;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.hra);
	}

	@Override
	public int getSalary() {
		return super.salary + this.hra;
	}

	public int getHra() {
		return this.hra;
	}
}

class MarketingExecutive extends Employee {
	private int ta;

	public MarketingExecutive(String name, int salary, int ta) {
		super(name, salary);
		this.ta = ta;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.ta);
	}

	@Override 
	public int getSalary() {
		return super.salary + this.ta;
	}

	public int getTa() {
		return this.ta;
	}
}

public class TestEmployee {
	public static void main(String[] args) {
        Employee e;
       
		e = new Manager("Ellison", 200000, 50000);
		e.print();  // runtime polymorphism 
		System.out.println(e.getSalary());
		
		e = new MarketingExecutive("Tom", 50000, 20000);
		e.print();  // runtime polymorphism 
		System.out.println(e.getSalary());
	}

}
