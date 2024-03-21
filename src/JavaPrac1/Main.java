package JavaPrac1;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat makes meows");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        
        Dog d1= new Dog();
       
        a1.sound();
        a2.sound();
        a3.sound();
        d1.sound();
    }
}