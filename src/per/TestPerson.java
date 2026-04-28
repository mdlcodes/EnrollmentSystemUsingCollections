package per;

import java.util.*;
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("Edwin", 20);
		Person p2 = new Person("Percy", 30);
		Person p3 = new Person("Erickson", 24);
		Person p4 = new Person("Jerry", 18);
		Person p5 = new Person("Lesley", 27);
		
		List<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		//sorted descending by age
		//Collections.sort(people);
		
		//no sorting remain as is
		
		//prints in descending order
		Collections.sort(people, Collections.reverseOrder());
		
		for(Person p: people) {
			System.out.println(p);
		}
	}
}
