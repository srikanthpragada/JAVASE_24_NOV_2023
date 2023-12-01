package oop1;

public class Product {
	// Instance variables
	private String name;
	private int price;

	// Methods
	public void init(String n, int p) {
		name = n;
		price = p;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
	}

}
