package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String[] names = { "Java", "Python", "C#", "JavaScript", "SQL" };

		// Try with resource
		try (FileWriter fw = new FileWriter("names.txt")) {

			for (var name : names)
				fw.write(name + "\n");
		}

	}

}
