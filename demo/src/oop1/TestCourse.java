package oop1;

class Course {
	// Instance variables
	private String title;
	private int fee, duration;

	// static or class variables
	private static int taxRate = 12;

	public static int getTaxRate() {
		return Course.taxRate;
	}
	
	// Constructor
	public Course(String title, int fee, int duration) {
		this.title = title;
		this.fee = fee;
		this.duration = duration;
	}

	public void print() {
		System.out.println(this.title);
		System.out.println(this.fee);
		System.out.println(this.duration);
	}

	public int getNetFee() {
		return this.fee + this.fee * Course.taxRate / 100;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}

public class TestCourse {
	public static void main(String[] args) {
		
		Course c = new Course("Java SE", 10000, 30);
		// Course c2 = new Course(); // calling default constructor
		c.setFee(12000);
		c.print();
		System.out.println(c.getNetFee());
		
		Course c2 = new Course("Python", 15000, 30);
		
		
		System.out.println(Course.getTaxRate());
		
		
	}
}
