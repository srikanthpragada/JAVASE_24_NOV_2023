package lib1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, Month.JANUARY, 1); 
		LocalDate newdate = date.plusDays(100); 
		System.out.println(newdate);
		
		LocalDate dob2=LocalDate.parse("09-10-2002", 
				 DateTimeFormatter.ofPattern("dd-MM-uuuu")); 
		System.out.println(dob2);

		
		LocalTime now = LocalTime.now(); 
		System.out.println(now);
		LocalTime singtime = LocalTime.now(ZoneId.of("Australia/Sydney"));
		System.out.println(singtime);
		
		var ct = LocalDateTime.now();
		System.out.println(ct);
		
	}

}
