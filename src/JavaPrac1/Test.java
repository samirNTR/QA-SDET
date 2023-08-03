package JavaPrac1;

public class Test {


static String companyName="Cognizant";

int age;

String name;

Test(String name, int age)
{

this.age=age;
this.name=name;


}

void display()
{

System.out.println("Name is "+name+":"+ age);
}

public static void main(String[] args)
{


Test t1= new Test("Samir",23);
Test t2= new Test("Sanjay",29);

Test t3= t1;

t2.age=25;

t1.display();
t2.display();
t3.display();
/*
 * t3.display(); t4.display();
 */
}


}

