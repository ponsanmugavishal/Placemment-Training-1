abstract class Shapes{
    abstract void area();
    //if we open many abstract methods in the abstract class, then we have to implement all the abstract methods in the child class.
    void Square () {
        System.out.println("square's area" );
    }

    void Rectangle () {
        System.out.println("rectangle's area" );
    }

    void Circle () {
        System.out.println("circle's area" );
    }
}

class connect extends Shapes {
    void area() {
        System.out.println("Area of the shape: ");
    }

    void Square (int side) {
        System.out.println("Area of square: " + (side * side));
    }

    void Rectangle (int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    void Circle (double radius) {
        System.out.printf("Area of circle: %.2f%n", (3.14 * radius * radius));
    }
}

public class abstract_class {
    public static void main(String[] args) {
        connect obj = new connect();
        obj.area();
        obj.Square();
        obj.Square(5);
        obj.Rectangle();
        obj.Rectangle(4, 6);
        obj.Circle();
        obj.Circle(3.0);
    }

}