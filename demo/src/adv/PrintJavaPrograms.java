package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintJavaPrograms {

	public static void printFile(Path p) {
		System.out.printf("File : %s\n", p.toString());
		System.out.println("=".repeat(80));
		
		try {
			Files.lines(p)
			     .forEach(System.out::println);
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {

		Path path = Path.of("d:\\classroom\\nov24\\demo");

		Files.walk(path)
		     .filter(p -> p.toString().endsWith(".java"))
		     .forEach(PrintJavaPrograms::printFile);
	}

}
