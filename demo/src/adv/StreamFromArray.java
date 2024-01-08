package adv;

import java.util.Arrays;

public class StreamFromArray {

	public static void main(String[] args) {
		 int a[] = {10,20,44,33,55,23,34,60};
		 
		 Arrays.stream(a)
		       .filter( v -> v % 2 == 0)          // IntPredicate  (boolean test(int))
		       .sorted()
		       .limit(3)
		       .forEach(System.out::println);     // IntConsumer  (void accept(int))

		 var largest = 
		    Arrays.stream(a)
	       .filter( v -> v % 2 != 0)          // IntPredicate  (boolean test(int))
	       .max();
		 
		 if(largest.isPresent())
		     System.out.println(largest.getAsInt());
		 
		 
		 var negative = 
		    Arrays.stream(a)
	              .anyMatch( v -> v < 0);
		 
		 System.out.println(negative);
 
	       
 
		 
	}

}
