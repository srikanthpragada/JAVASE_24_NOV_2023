package adv;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class MapStream {

	public static void main(String[] args) {
		 
		String  dates[] =
			       {"2000-10-20", 
			        "2000-01-02",
			        "1999-10-10",
				    "2001-09-09"};
		
		Arrays.stream(dates)
		      .map(s  -> LocalDate.parse(s))  // String to LocalDate
		      .map(d  -> Period.between(d, LocalDate.now()).getYears())
		      .forEach(System.out::println);
	

	}

}
