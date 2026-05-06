package MethodOverLoading;

public class SubtractMOL {

    int subtract(int a, int b)
    {
        return a-b;
    }
    float subtract(float a, float b)
    {
        return a-b;
    }
    double subtract(double a, double b,double c)
    {
        return a-b-c;
    }
    double subtract(int a, double b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        SubtractMOL obj = new SubtractMOL();
        System.out.println(obj.subtract(20, 10));
        System.out.println(obj.subtract(20.5f, 10.5f));
        System.out.println(obj.subtract(30.5, 20.5, 10.5));
        System.out.println(obj.subtract(20, 10.5));
    }
}

