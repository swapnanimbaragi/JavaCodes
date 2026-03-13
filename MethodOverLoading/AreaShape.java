package MethodOverLoading;

public class AreaShape {
    int area(int a)
    {
        return a*a;
    }
    double area(double a, double b)
    {
        return a*b;
    }
    double area(double r)
    {
        return Math.PI * r * r;
    }
    double area(int a, double b)
    {
        return 0.5*a*b;
    }
    public static void main(String[] args) {
        AreaShape obj = new AreaShape();
        System.out.println(obj.area(20));
        System.out.println(obj.area(20.5, 10.5));
        System.out.println(obj.area(30.5));
        System.out.println(obj.area(20, 10.5));
    }
}
