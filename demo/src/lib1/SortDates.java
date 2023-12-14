package lib1;

import java.time.LocalDate;
import java.util.Arrays;

public class SortDates {

	public static void main(String[] args) {
		
		LocalDate dates[] = new LocalDate[10];
		
		for(int i = 0; i < dates.length; i ++)
		{
			int year =  2000 + ((int)  (Math.random() * 20));
			int month = ((int)  (Math.random() * 12));
			int day =  ((int)  (Math.random() * 28));
			
			dates[i] = LocalDate.of(year,  month,  day);
		}
		
		Arrays.sort(dates);
		
		for(var d : dates)
			System.out.println(d);
	}

}
