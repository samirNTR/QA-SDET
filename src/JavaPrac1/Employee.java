package JavaPrac1;

public class Employee {
	
	
	public class ArraySumCalculator {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5, 8, 10};
	        int sum = calculateSum(arr);
	        System.out.println("Sum: " + sum);
	    }

	    public static int calculateSum(int[] arr) {
	        if (arr.length == 1) {
	            return arr[0];
	        }

	        int[] temp = new int[arr.length / 2];
	        int j = 0;

	        for (int i = 0; i < arr.length - 1; i += 2) {
	            temp[j] = arr[i] + arr[i + 1];
	            j++;
	        }

	        return calculateSum(temp);
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
}
