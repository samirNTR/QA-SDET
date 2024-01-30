package oops;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myAnimal= new Dog();
        Animal myAnimal2= new Animal();
        //Dog myDog2= (Dog) new Animal(); //Class cast runtime exception 
        
        
        myDog.eat();
        myAnimal.eat();
        myAnimal2.eat();
        //myDog2.eat();
    }
}
