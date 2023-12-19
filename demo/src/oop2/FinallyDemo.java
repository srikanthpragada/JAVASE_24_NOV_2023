package oop2;

public class FinallyDemo {

	public static void main(String[] args) {
		String st = "a10";

		try {
			int n = Integer.parseInt(st);
			System.out.println(100 % n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} finally {
			System.out.println("Finally!");
		}

		System.out.println("The End!");

	}

}
