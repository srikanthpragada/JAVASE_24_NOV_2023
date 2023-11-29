package gs;

public class ArrayDemo {

	public static void main(String[] args) {
		 // int a[] = new int[20];
		
		 int a[] = {10,20,33,44,55};
		 
		 for(int i = 0; i < a.length; i ++)
			 System.out.println(a[i]);
		 
		 for(int n : a)
			 System.out.println(n);
	}

}
