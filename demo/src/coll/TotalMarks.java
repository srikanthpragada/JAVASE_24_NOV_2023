package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class TotalMarks {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("marks.txt");
		var lines = Files.readAllLines(p);

		var students = new TreeMap<String, Integer>();

		for (var line : lines) {
			var parts = line.split(",");

			// get total for marks that are from 2nd element
			int total = 0;
			for (int i = 1; i < parts.length; i++) {
				total += Integer.parseInt(parts[i]);
			}

			students.put(parts[0], total);
		}

		for (var name : students.keySet())
			System.out.printf("%-20s %3d\n", name, students.get(name));

	}

}
