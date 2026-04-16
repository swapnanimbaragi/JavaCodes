package OOPS;

import java.util.Scanner;
abstract class Shape
{
    float  area;

    abstract void acceptInput();
    abstract void calcArea();
    void display()
    {
        System.out.println("Area is: " + area);
    }
}

class square extends Shape
{
    float side;

    void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        side = sc.nextFloat();
    }

    void calcArea()
    {
        area = side * side;
    }
}
class Rectangle extends Shape
{
    float l, b;

    void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        l = sc.nextFloat();
        b = sc.nextFloat();
    }

    void calcArea()
    {
        area = l * b;
    }
}
class Circle extends Shape
{
    float r;

    void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextFloat();
    }

    void calcArea()
    {
        area = 3.14f * r * r;
    }
}
class Geometry
{
    void method(Shape s)
    {
        s.acceptInput();
        s.calcArea();
        s.display();
    }
}
class Test
{
    public static void main(String[] args)
    {
        Geometry g = new Geometry();

        square s = new square();
        g.method(s);

        Rectangle r = new Rectangle();
        g.method(r);

        Circle c = new Circle();
        g.method(c);
    }
}