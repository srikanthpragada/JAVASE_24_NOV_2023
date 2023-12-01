package oop1;

public class TestProduct {

	public static void main(String[] args) {
		 Product p1;  // Object reference 
		 p1 = new Product();  // Object 
		 
		 // System.out.println(p1.name);
		 p1.init("iPhone 15", 100000);
		 p1.print();
		 
		 Product p2 = new Product();
		 p2.init("Samsung Fold", 120000);
		 p2.print();

	}

}
