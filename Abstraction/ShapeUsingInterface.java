package Abstraction;
import java.util.Scanner;

// Interface Shape with a method getArea()
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    float length, width;
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    float radius;
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    float base, height;
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class ShapeUsingInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if(input.equals("Rectangle")) {
            Rectangle r = new Rectangle();
            r.length = scanner.nextFloat();
            r.width = scanner.nextFloat();
            System.out.println(r.getArea());
        }
        else if(input.equals("Circle")) {
            Circle c = new Circle();
            c.radius = scanner.nextFloat();
            System.out.println(c.getArea());
        }
        else if(input.equals("Triangle")) {
            Triangle t = new Triangle();
            t.base = scanner.nextFloat();
            t.height = scanner.nextFloat();
            System.out.println(t.getArea());
        }

        scanner.close();
    }
}

    
