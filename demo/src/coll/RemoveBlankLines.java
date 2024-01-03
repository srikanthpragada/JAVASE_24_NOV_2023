package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class RemoveBlankLines {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter filename : ");
		var filename = s.nextLine();
		
		var path = Path.of(filename);
		var lines = Files.readAllLines(path);
		
		var lineno = 1;
		for(var line : lines) {
			System.out.printf("%3d:%s\n", lineno, line);
			lineno ++;
		}
	}

}
