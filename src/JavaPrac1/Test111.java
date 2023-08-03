package JavaPrac1;

public class Test111 {

	
	static int num;
	Test111(int num)
	{
		
		System.out.println("I am in constructor");
		System.out.println(num);
	}
	
	
	void display()
	{
		
		System.out.println("I am in method");
		System.out.println(num);
	}
	public static void main(String[] args) {
		
		
		
		Test111 t1= new Test111(90);
		t1.display();
		System.out.println(num);
	
	}

}
