package JavaPrac1;

public class Employee {

	private String name;
	private int age;
	private String department;

	public Employee() {
		this("John Doe", 25, "IT");
	}

	public Employee(String name) {
		this(name, 25, "IT");
	}

	public Employee(String name, int age) {
		this(name, age, "IT");
	}

	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}



	public static void main(String[] args) {
		
		
		Employee e1= new Employee("Raju", 77, "QA");
		
		System.out.println(((Employee) e1).Employee());
		// TODO Auto-generated method stub

	}

	private char[] Employee() {
		// TODO Auto-generated method stub
		return null;
	}

}
