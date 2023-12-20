package oop2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedDemo {

	public static void main(String[] args) throws FileNotFoundException {
		 
		int n = Integer.parseInt("123"); // unchecked exception
		
		FileReader fr = new FileReader("names.txt");  // checked exception 
		

	}

}
