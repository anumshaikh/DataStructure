package linkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
	String name;
	int age;
	String Gender;

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.Gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.Gender;
	}

	@Override
	public String toString() {
		return "{" + this.name + "," + this.age + "," + this.Gender + "}";
	}

}

public class JavaStreamsEg {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Anum", 24, "Female"));
		people.add(new Person("Sara", 26, "Female"));
		people.add(new Person("Anjum", 52, "Female"));
		people.add(new Person("Mujeeb", 55, "Male"));
		people.add(new Person("Maw", 25, "Male"));

		// people.forEach(System.out::println);

		// Using Stream to filter Data

		List<Person> females=people.stream().filter(Person -> Person.Gender.equalsIgnoreCase("female")).collect(Collectors.toList());
		//females.forEach(System.out::println);
		// Sorted the list
		List<Person> sort=people.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		//sort.forEach(System.out::println);
		
		//getting matchees from the list
		Boolean young =people.stream().anyMatch(Person-> Person.getAge() < 30);
		//System.out.println("young "+young);
		
		Boolean old =people.stream().allMatch(Person-> Person.getAge() < 100);
		//System.out.println("old "+old);
		
		Boolean kids =people.stream().noneMatch(Person-> Person.getAge() < 10);
		//System.out.println("kids "+kids);
		 
		//check max / min value from list
		people.stream().min(Comparator.comparing(Person :: getAge)).ifPresent(System.out :: println);
		
		//group elements of the list
		Map<String, List<Person>> groupByGender=
				people.stream().collect(Collectors.groupingBy(Person::getGender));
		
		groupByGender.forEach((Gender,people1)->{
			System.out.println("Gender "+Gender);
			people1.forEach(System.out::println);
		});
		
	}

}
