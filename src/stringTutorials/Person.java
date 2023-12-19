package stringTutorials;

import java.util.ArrayList;
import java.util.List;

public class Person {

	String name;
	
	Person(String name)
	{
		
		this.name=name;
	}
	public static void main(String[] args) {
		Person chuck = new Person("chuck");
		Person norris= new Person("norris");


		List<String> persons= new ArrayList<String>();

	
		persons.add("chuck");
		persons.add("norris");

		chuck=norris;

		norris=null;
	
		chuck.name="ricky";

		


		System.out.print(persons.get(0)+" "+persons.get(1));


	}

}
