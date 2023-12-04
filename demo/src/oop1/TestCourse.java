package oop1;

class Course {
	private String title;
	private int fee, duration;

	// Constructor
	public Course(String t, int f, int d) {
		title = t;
		fee = f;
		duration = d;
	}

	public void print() {
		System.out.println(title);
		System.out.println(fee);
		System.out.println(duration);
	}

	public int getNetFee() {
		return fee + fee * 12 / 100;
	}
	
	public void setFee(int f) {
		fee = f;
	}
}

public class TestCourse {

	public static void main(String[] args) {
		Course c = new Course("Java SE", 10000, 30);
		//Course c2 = new Course();  // calling default constructor 
		c.setFee(12000);
		c.print();
		System.out.println(c.getNetFee());
	}
}
