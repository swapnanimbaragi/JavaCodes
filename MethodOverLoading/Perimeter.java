package MethodOverLoading;

public class Perimeter {
    int perimeter(int a)
    {
        return 4*a;
    }
    double perimeter(double a, double b)
    {
        return 2*(a+b);
    }
    double perimeter(double r)
    {
        return 2 * Math.PI * r;
    }
    double perimeter(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        Perimeter obj = new Perimeter();
        System.out.println("Square: " + obj.perimeter(20));
        System.out.println("Rectangle: " + obj.perimeter(20.5, 10.5));
        System.out.println("Circle: " + obj.perimeter(30.5));
        System.out.println("Triangle: " + obj.perimeter(20, 10, 30));
    }
}
