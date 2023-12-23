package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	String key;
	String value;

	public Employee(String key, String value) {
		this.key = key;

		this.value = value;

	}

	public String getKey() {
		return key;

	}

	public String getValue() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee("name", "John");
		
		Employee e2= new Employee("city", "Delhi");
		
		Employee e3= new Employee("Hobbies", "Reading");
		
		//Adding to collection HashMap
		
		Map<String,String> hm= new HashMap<String,String>();
		
		hm.put(e1.getKey(), e1.getValue());
		hm.put(e2.getKey(), e2.getValue());
		hm.put(e3.getKey(), e3.getValue());
		
		//Retrieve
		
		String name= hm.get("name");
		String city=hm.get("city");
		
		String Hobbies=hm.get("Hobbies");
		
		System.out.println("Name: "+name+"\nCity :"+city+"\nHobbies: "+Hobbies);
		
		
		

	}

}
