package MethodOverLoading;

public class DivisionMOL {
    int divide(int a, int b)
    {
        return a/b;
    }
    float divide(float a, float b)
    {
        return a/b;
    }
    double divide(double a, double b,double c)
    {
        return a/b/c;
    }
    double divide(int a, double b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        DivisionMOL obj = new DivisionMOL();
        System.out.println(obj.divide(20, 10));
        System.out.println(obj.divide(20.5f, 10.5f));
        System.out.println(obj.divide(30.5, 20.5, 10.5));
        System.out.println(obj.divide(20, 10.5));
    }
}
