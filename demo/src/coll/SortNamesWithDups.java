package coll;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SortNamesWithDups {

	public static void main(String[] args) {
	    
		Scanner s = new Scanner(System.in);
		var names = new ArrayList<String>();
		
		while(true) {
			System.out.print("Enter name [end to stop] :");
			String name = s.nextLine();
			if(name.equals("end"))
				 break;
			
			names.add(name);
		}
		
		names.sort(null);
		
		for(var name : names)
			System.out.println(name);

		s.close();
	}

}
