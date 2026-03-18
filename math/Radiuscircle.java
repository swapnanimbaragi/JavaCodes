package Codes.math;
import java.util.Scanner;
public class Radiuscircle {
    static float radius(int r)
    {
        float res;
        float pi = 3.142f;
        res=2*pi*r;
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        System.out.println("Radius of the circle is :"+radius(r));

    }
}
