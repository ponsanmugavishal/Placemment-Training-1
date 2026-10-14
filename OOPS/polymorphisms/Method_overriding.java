import java.util.Scanner;
class shape {
    void Area() {
        System.out.println("Area");
        System.out.println();
    }
}

class Rectangle extends shape {
    // shape class method overriding by Rectangle class
    void Area(int a,int b) {
        System.out.println("Rectangle Area");
        System.out.println("a * b = " + a * b);
        System.out.println();

    }
}

class Circle extends shape {
    // shape class method overriding by Circle class
    void Area(int r) {
        System.out.println("Circle Area");
        System.out.println("3.14 * r * r = " + 3.14 * r * r);
        System.out.println();
    }
}


public class Method_overriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        Rectangle obj = new Rectangle();
        Circle obj1 = new Circle();
        obj.Area();
        obj.Area(sc.nextInt(), sc.nextInt());
        System.out.print("Enter the radius of circle: ");
        obj1.Area(sc.nextInt());
        sc.close();
    }
}
