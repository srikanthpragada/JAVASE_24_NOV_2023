package coll;



public class GenericMethods {

//	public static void print(int a[]) {
//		for(var n : a)
//			System.out.println(n);
//	}
//	
//	public static void print(String a[]) {
//		for(var n : a)
//			System.out.println(n);
//	}
	
	// Generic method using Type Parameter
	public static <T> void print(T a[]) {
		for(T n : a)
			System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		 Integer nums[] = {10,30,40,50,56};
		 String names[] = {"Java", "Python", "SQL", "JavaScript"};
		 
		 
		 print(nums);
		 print(names);
	}

}
