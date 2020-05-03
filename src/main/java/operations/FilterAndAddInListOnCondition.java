package operations;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import model.Person;

public class FilterAndAddInListOnCondition {

	private static int count = 567;

	public static void main(String[] args) {

		Person person1 = new Person(21);
		person1.setName("A");
		Person person2 = new Person(22);
		person2.setName("B");
		Person person3 = new Person(23);
		person3.setName("C");
		Person person4 = new Person(24);
		Person person5 = new Person(24);
		Person person6 = new Person(25);

		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);

		persons.stream().filter(c -> c.getName() == null).forEach(p -> p.setName(getData()));

		persons.stream().forEach(System.out::println);

	}

	private static String getData() {
		count++;
		return count + "Adit";
	}

}
