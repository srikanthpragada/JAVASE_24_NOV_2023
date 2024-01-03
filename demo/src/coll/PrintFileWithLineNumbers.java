package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class PrintFileWithLineNumbers {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter filename : ");
		var filename = s.nextLine();

		// read all lines from the file
		var path = Path.of(filename);
		var lines = Files.readAllLines(path);

		// create file
		try (var writer = Files.newBufferedWriter(path)) {
			// write all non-blank lines
			for (var line : lines) {
				if (line.trim().length() > 0)
					writer.write(line + "\n");
			}
		}
	}

}
