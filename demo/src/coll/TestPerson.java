package coll;

import java.util.HashSet;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		System.out.println("Equals");
		var other = (Person) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}
	
	public int hashCode() {
		return this.age;
	}

	public String toString() {
		return this.name + " - " + this.age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		var people = new HashSet<Person>();

		people.add(new Person("A", 20));
		people.add(new Person("B", 25));
		people.add(new Person("A", 20));
		people.add(new Person("C", 20));

		for (var p : people) {
			System.out.println(p);
			//System.out.println(p.hashCode());
		}
		    
	}

}
