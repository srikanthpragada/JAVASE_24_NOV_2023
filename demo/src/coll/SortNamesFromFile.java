package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		var path = Path.of("names.txt");
		var lines = Files.readAllLines(path);

		for (var name : lines) {
			if (name.length() > 4)
				System.out.println(name);
		}
	}

}
