package oop2;

public class ExceptionDemo {

	public static void main(String[] args) {
		String st = "0";

		try {
			int n = Integer.parseInt(st);
			System.out.println(100 % n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} catch (ArithmeticException ex) {
			System.out.println("Zero is invalid!");
		}

		System.out.println("The End!");

	}

}
