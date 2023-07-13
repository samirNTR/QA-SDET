package Testing;

public class Demo {

	//non-static function
	void display()
	{
	System.out.println("A non-static function is called.");
	}
	//static function
	static void show()
	{
	System.out.println("The static function is called.");
	}



	public static void main(String args[])
	{
	//creating an object of the class A
	Demo obj = new Demo();
	//calling a the non-static function by using the object of the class
	obj.display();
	//calling a static function by using the class name
	Demo.show();



	//obj.show();
	}
	}
