package oops;

class MyShape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class MyCircle extends MyShape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class MySquare extends MyShape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

class Drawing {
    // Compile-time polymorphism (method overloading)
    void drawShape(MyShape shape1) {
        System.out.println("Drawing a generic shape");
    }

    void drawShape(Circle circle) {
        System.out.println("Drawing a specific circle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        // Runtime polymorphism (method overriding)
        MyShape shape1 = new MyCircle();
        MyShape shape2 = new MySquare();

        shape1.draw();  // Calls draw() method of Circle
        shape2.draw();  // Calls draw() method of Square

        // Compile-time polymorphism (method overloading)
        drawing.drawShape(shape1);  // Calls drawShape(Shape) method
        drawing.drawShape(new Circle());  // Calls drawShape(Circle) method
    }
}
