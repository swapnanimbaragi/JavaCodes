package Abstraction;
import java.util.*;
interface Shape {
    void acceptInput(Scanner sc);      // abstract method
    void calculateArea();   // abstract method
}
class Square implements Shape
{
    float side;
    public void acceptInput(Scanner sc)
    {
        
        side = sc.nextFloat();
    }
    public void calculateArea()
    {
        float area = side * side;
        System.out.println("Area of square: " + area);
    }
}
class Rectangle implements Shape
{
    float length, breadth;
    public void acceptInput(Scanner sc)
    {
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }
    public void calculateArea()
    {
        float area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
class Circle implements Shape
{
    float radius;
    public void acceptInput(Scanner sc)
    {
        
        radius = sc.nextFloat();
    }
    public void calculateArea()
    {
        float area =(float)( Math.PI * radius * radius);
        System.out.println("Area of circle: " + area);
    }
}
class Triangle implements Shape
{
    float base, height;
    public void acceptInput(Scanner sc)
    {
        base = sc.nextFloat();
        height = sc.nextFloat();
    }
    public void calculateArea()
    {
        float area = 0.5f * base * height;
        System.out.println("Area of triangle: " + area);
    }
}
public class ShapeUsingInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shapeType = sc.next();   
        Shape s;
        if(shapeType.equalsIgnoreCase("Square"))
        {
            s = new Square();
            s.acceptInput(sc);
            s.calculateArea();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle"))
        {
            s = new Rectangle();
            s.acceptInput(sc);
            s.calculateArea();
        }
        else if(shapeType.equalsIgnoreCase("Circle"))
        {
            s = new Circle();
            s.acceptInput(sc);
            s.calculateArea();
        }
        else if(shapeType.equalsIgnoreCase("Triangle"))
        {
            s = new Triangle();
            s.acceptInput(sc);
            s.calculateArea();
        }
        else
        {
            System.out.println("Invalid shape type!");
        }
    }
}
