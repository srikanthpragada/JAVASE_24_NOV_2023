package lib1;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinStrings {

	public static void main(String[] args) {
		 
		var s = new Scanner(System.in);
		var sj = new StringJoiner("-");
		
		while(true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();
			if(name.equals("end"))
				 break; 
			
			sj.add(name);
		}
		
		System.out.println(sj);  // sj.toString() 
		s.close(); 
	}
}
