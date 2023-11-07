package oops;

public class Test {

	static String company = "Cognizant";

	int employeeId;
	String employeeName;
	int age;

	public Test( int employeID, String employeeName, int age) {

		this.employeeId=employeID;
		this.employeeName=employeeName;
		this.age=age;
		
	}
	
	void displayInfo()
	{
		System.out.println("EmployeeID "+employeeId+" Name "+employeeName +" EmployeeAge "+age);
		
	}

	public static void main(String[] args) {
		
		Test t1= new Test(123,"Samir", 29);
		t1.displayInfo();
		Test t2=t1;
		t2.age=35;
     t2.displayInfo();
	 t1.displayInfo();  
	 Test t3=t2;
	 
	 t3.age=39;
	 t3.displayInfo();
	 //--3
		/*
		 * Test t2=t1; t2.age=89;
		 */

	}

}
