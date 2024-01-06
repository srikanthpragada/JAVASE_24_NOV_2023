package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortUniqueWords2 {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("test.txt");
		var contents = Files.readString(p);
		
		// Create RE 
		Pattern re = Pattern.compile("\\W+");
		
		// Split contents into words  
		var words = re.split(contents);
		
		// convert array to list
		var wordsList = Arrays.asList(words);
		
		// Create TreeSet from collection
		var sortedWords = new TreeSet<String>(wordsList);

		for (var w : sortedWords)
			System.out.println(w);

	}

}
