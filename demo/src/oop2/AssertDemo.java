package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {

		assert isEven(11) == false : "isEven() failed for odd numbers";
		assert isEven(10) == true : "isEven() failed for even numbers";
		assert add(10,20) == 30 : "add(10,20) is not giving 30";

	}

}
