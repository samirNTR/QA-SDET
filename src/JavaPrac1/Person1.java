package JavaPrac1;

class Person {
    String name;

    // Constructor that takes a reference object as a parameter
    public Person(String name) {
        this.name = name;
    }

    // Method to display the name
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

public class Person1 {
    public static void main(String[] args) {
        // Creating a reference object of type Person
        Person person1 = new Person("John");

        // Using the constructor to initialize another reference object
       Person person2 = person1;
       person1.displayName();
       person2.displayName();//-------------------------2
    
       
       
       
       
       person2.name="Kutta";
       Person person3=person2;
  
       person3.name="Kulla";
    
       person1.displayName();
       person2.displayName();
      person3.displayName();
        
        
    }
}
