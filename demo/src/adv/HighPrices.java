package adv;

import java.nio.file.Files;
import java.nio.file.Path;

public class HighPrices {

	public static void main(String[] args) throws Exception {
		 Path p = Path.of("prices.txt");
		 
		 var stream = Files.lines(p);
		 
		 var avg = stream.mapToInt( v -> Integer.parseInt(v))
		                 .average().getAsDouble();
		 
		 Files.lines(p)
		       .mapToInt( v -> Integer.parseInt(v))
		       .filter( v -> v > avg)
		       .forEach(System.out::println);

	}

}
