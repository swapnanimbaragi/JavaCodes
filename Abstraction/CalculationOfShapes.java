package Abstraction;
import java.util.*;

abstract class Shape {
    float area;
    abstract void acceptInput();      // abstract method
    abstract void calculateArea();   // abstract method
}
class Square extends Shape
{
    float side;
    void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        side = sc.nextFloat();
    }
    void calculateArea()
    {
        area = side * side;
        System.out.println("Area of square: " + area);
    }
}

class Rectangle extends Shape
{
    float length, breadth;
    void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }
    void calculateArea()
    {
        area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}

class Circle extends Shape
{
    float radius;
    void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
    }
    void calculateArea()
    {
        area =(float)( Math.PI * radius * radius);
        System.out.println("Area of circle: " + area);
    }
}
public class CalculationOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shapeType = sc.nextLine();
        Shape s;
        if(shapeType.equalsIgnoreCase("Square"))
        {
            s = new Square();
            s.acceptInput();
            s.calculateArea();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle"))
        {
            s = new Rectangle();
            s.acceptInput();
            s.calculateArea();
        }
        else if(shapeType.equalsIgnoreCase("Circle"))
        {
            s = new Circle();
            s.acceptInput();
            s.calculateArea();
        }
        else
        {
            System.out.println("Unknown shape");
        }
    }
}
