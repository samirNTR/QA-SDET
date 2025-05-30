package JavaPrac1;

class A
{
	int i=10;
	
	public void show()
	{
		System.out.println("I am in A");
	}
}

class B extends A
{
	int i=20;
	
	public void show()
	{
		
		System.out.println("I am in B");
	}
}


public class Main1223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	A a1= new B();
	A a2= new A();
	B b1= new B();
	
	System.out.println(a1.i);
	System.out.println(b1.i);
	a1.show();
	b1.show();
	a2.show();
	}

}
