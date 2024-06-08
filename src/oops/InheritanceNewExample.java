package oops; // Ensure the correct package is specified

class Animal1 {
	
	int a=10;
    Animal1() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 { // Fix the import statement to match the class name
    
	int a=20;
	
	Dog1() {
        super(); // Call to the superclass constructor (Animal constructor)
        System.out.println("Dog constructor");
    }

    void eat() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceNewExample {
    public static void main(String[] args) {
      
       
        Animal1 myAnimal1 = new Dog1();
        Dog1 myDog = new Dog1();
        Animal1 myAnimal2 = new Animal1();
        // Dog1 myDog2 = (Dog1) new Animal1(); // This will not compile due to incompatible types

        
        
        myAnimal1.eat();    // Calls Dog's eat method (dynamic method dispatch)
        myDog.eat();       // Calls Dog's eat method
     
        myAnimal2.eat();   // Calls Animal's eat method
        // myDog2.eat();    // Results in a compilation error
        
        System.out.println(myAnimal1.a);  //Refer parent class variable
        System.out.println(myDog.a);
    }
}

