package JavaPrac1;

public class Employee1 {

	String name;
	int emp_id;

	public Employee1() {
		this("Samir",90);


	}

	public Employee1(String name, int emp_id)
	{

		this.name=name;
		this.emp_id=emp_id;

	}

public void displayInfo() {


	System.out.println("The name is "+ name);
	System.out.println("The employee id is "+emp_id);
}

	public static void main(String[] args) {

		Employee1 e1= new Employee1();
        e1.displayInfo();
		/*
		 * Employee1 e1= new Employee1("Sonu", 33); Employee1 e2= new Employee1("Sanju",
		 * 55);
		 *
		 * e1.displayInfo(); e2.displayInfo();
		 */
	}

}
