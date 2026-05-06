package MethodOverLoading;

public class ProductMOL {
    int multiply(int a, int b)
    {
        return a*b;
    }
    float multiply(float a, float b)
    {
        return a*b;
    }
    double multiply(double a, double b,double c)
    {
        return a*b*c;
    }
    double multiply(int a, double b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        ProductMOL obj = new ProductMOL();
        System.out.println(obj.multiply(10, 20));
        System.out.println(obj.multiply(10.5f, 20.5f));
        System.out.println(obj.multiply(10.5, 20.5, 30.5));
        System.out.println(obj.multiply(10, 20.5));
    }
}
