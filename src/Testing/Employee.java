package Testing;

public class Employee {

	String Company_name;
	String Ename;
	int empId;
	String Scooter_Name;
	int i=1000;
	Employee(String Company_name, int empID, String Ename)
	{

		this.empId=empID;
		this.Ename=Ename;
		this.Company_name=Company_name;

	}

	Employee(String Scooter_Name)
	{

		this.Scooter_Name=Scooter_Name;
	}

	void display() //1
	{
		System.out.println(Company_name+" "+ empId+" "+ Ename);

	}

	void display1() //2
	{
		System.out.println(Company_name + Scooter_Name+" "+i);

	}




	public static void main(String[] args)
	{
		int j=10007777;
		final int side= 100;
		Employee e1= new Employee("Cognizant", 2092330, "Samir");
		Employee e2= new Employee("Chetak");
		e1.display();
		e1.display1();
		e2.display(); //cognizant 0 null
		e2.display1();






	}}
