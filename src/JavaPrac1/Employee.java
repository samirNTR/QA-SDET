package JavaPrac1;

public class Employee {

	    public static int calculateSum(int[] array) {
	        int sum = 0;
	        boolean oddLength = false;

	        if (array.length % 2 != 0) {
	            oddLength = true;
	        }

	        for (int i = 0; i < array.length - 1; i += 2) {
	            sum += array[i] + array[i + 1];
	        }

	        if (oddLength) {
	            sum += array[array.length - 1];
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 4, 5, 8, 10};
	        int sum = calculateSum(array);
	        System.out.println("Sum of array: " + sum);
	    }
	}


/*
 * private String name; private int age; private String department;
 *
 * public Employee() { this("John Doe", 25, "IT"); }
 *
 * public Employee(String name) { this(name, 25, "IT"); }
 *
 * public Employee(String name, int age) { this(name, age, "IT"); }
 *
 * public Employee(String name, int age, String department) { this.name = name;
 * this.age = age; this.department = department; }
 *
 *
 *
 * public static void main(String[] args) {
 *
 *
 * Employee e1= new Employee("Raju", 77, "QA");
 *
 * System.out.println(((Employee) e1).Employee()); // TODO Auto-generated method
 * stub
 *
 * }
 *
 * private char[] Employee() { // TODO Auto-generated method stub return null; }
 */

