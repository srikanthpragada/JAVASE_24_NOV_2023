package coll;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var al = new ArrayList();
		
		al.add("Abc");
		al.add(10); // 10 to Integer 
		al.add("Xyz");
		
		String s = (String) al.get(0);
		
		// Type-safe 
		var names = new ArrayList<String>();
		names.add("Abc");
		String n = names.get(0);
		
		ArrayList<Integer> nums =new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<>();
		var nums3 = new ArrayList<Integer>();
	}
}
