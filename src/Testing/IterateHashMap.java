package Testing;

import java.util.HashMap;
import java.util.Map;


///LAMBDA EXPRESSION ITERATION HASHMAP
public class IterateHashMap {


	    public static void main(String[] args) {
	        Map<String, Double> employeeSalary = new HashMap<>();
	        employeeSalary.put("David", 76000.00);
	        employeeSalary.put("John", 120000.00);
	        employeeSalary.put("Mark", 95000.00);
	        employeeSalary.put("Steven", 134000.00);

	        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
	        employeeSalary.forEach((employee, salary) -> {
	            System.out.println(employee + " => " + salary);
	        });

	    }
}
