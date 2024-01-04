package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}

public class CustomSort {

	public static void main(String[] args) throws IOException {
		 Path  p = Path.of("names.txt");
		 
		 var names = Files.readAllLines(p);
		 
		 //Collections.sort(names, new LengthCompare());
		 Collections.sort(names, (s1,s2) -> s1.length() - s2.length()); // Lambda Expression
		 
		 for(var n : names)
			 System.out.println(n);

	}

}
