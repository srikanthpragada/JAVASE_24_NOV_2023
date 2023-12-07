package oop1;

class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.salary);
	}

	public int getSalary() {
		return this.salary;
	}

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
		return super.getSalary() + this.hra;
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
		return super.getSalary() + this.ta;
	}

	public int getTa() {
		return this.ta;
	}
}

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee("Larry", 100000);
		System.out.println(e.getSalary());

		Manager m = new Manager("Ellison", 200000, 50000);
		m.print();
		System.out.println(m.getSalary());
		
		e = m;  // Upcasting 
		
		//m = e; 
		
		

	}

}
