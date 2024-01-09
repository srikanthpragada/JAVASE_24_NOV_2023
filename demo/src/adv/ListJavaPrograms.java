package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaPrograms {

	public static void main(String[] args) throws IOException {
		 
		Path path = Path.of("d:\\classroom\\nov24\\demo");
		
		Files.walk(path)
		     .filter( p -> p.toString().endsWith(".java"))
		     .forEach(System.out::println);
	}

}
