package MethodOverLoading;

public class AdditionofMOL {
    int add(int a, int b)
    {
        return a+b;
    }
    float add(float a, float b)
    {
        return a+b;
    }
    double add(double a, double b,double c)
    {
        return a+b+c;
    }
    double add(int a, double b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        AdditionofMOL obj = new AdditionofMOL();
        System.out.println("Sum of integers: " + obj.add(10, 20));
        System.out.println("Sum of floats: " + obj.add(10.5f, 20.5f));
        System.out.println("Sum of doubles: " + obj.add(10.5, 20.5, 30.5));
        System.out.println("Sum of int and double: " + obj.add(10, 20.5));
    }
}
