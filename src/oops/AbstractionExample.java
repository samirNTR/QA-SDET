package oops;

//Abstract class
abstract class Shape {
 // Abstract method (no implementation)
 abstract void draw();

 // Concrete method
 void display() {
     System.out.println("Displaying the shape");
 }
}

//Concrete subclass
class Circle extends Shape {
 // Implementing the abstract method
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }
}

//Concrete subclass
class Rectangle extends Shape {
 // Implementing the abstract method
 @Override
 void draw() {
     System.out.println("Drawing a rectangle");
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     // Creating objects of concrete classes
     Circle circle = new Circle();
     Rectangle rectangle = new Rectangle();

     // Calling abstract method (polymorphism)
     circle.draw();      // Calls the draw() method of Circle
     rectangle.draw();   // Calls the draw() method of Rectangle

     // Calling concrete method
     circle.display();   // Calls the display() method of Shape
     rectangle.display(); // Calls the display() method of Shape
 }
}
