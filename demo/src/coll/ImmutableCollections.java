package coll;

import java.util.List;
import java.util.Map;

public class ImmutableCollections {

	public static void main(String[] args) {
		 var names = List.of("Java", "JavaScript", "Python", "SQL");
		 
		 for(var n : names)
			 System.out.println(n);
		 
		 Map<String,String> langs = Map.of("Java","21","Python","3.12");
		 
		 Map<Integer,String> map = Map.ofEntries(Map.entry(1,"One"),Map.entry(2,"Two"));
		 

	}

}
