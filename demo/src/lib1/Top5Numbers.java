package lib1;

import java.util.Arrays;

public class Top5Numbers {

	public static void main(String[] args) {
		 int a[] = new int[20];
		 
		 for(int i = 0; i < a.length ; i ++)
			 a[i] = (int) (Math.random() * 100);
		 
		 Arrays.sort(a);
		 
		 
		 for(int i = a.length - 1;  i >= a.length - 5  ; i --)
			 System.out.println(a[i]);
	}
}
