package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

class LargeName implements Predicate<String> {
	@Override
	public boolean test(String t) {
		 return t.length() > 3;
	}
}

public class LargeNamesSorted {

	public static void main(String[] args) throws IOException {
		 Path p = Path.of("names.txt");
		 
		 Files.lines(p)
		      .distinct()
		      .filter(s -> s.length() > 3) // new LargeName()
		      .sorted()
		      .forEach(System.out::println);

	}

}
