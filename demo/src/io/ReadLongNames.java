package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Show names that are longer than 4 chars 
public class ReadLongNames {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("names.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			 String name = br.readLine(); 
			 if(name == null) // EOF
				 break;
			 
			 if(name.length() > 4)
				 System.out.println(name);
		}
		
		br.close();
		fr.close();
	}

}
