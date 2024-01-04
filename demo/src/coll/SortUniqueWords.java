package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortUniqueWords {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("test.txt");

		var lines = Files.readAllLines(p);
		var words = new TreeSet<String>();

		for (var line : lines) {
			var parts = line.split(" ");
			for (var w : parts)
				words.add(w);
		}

		for (var w : words)
			System.out.println(w);

	}

}
