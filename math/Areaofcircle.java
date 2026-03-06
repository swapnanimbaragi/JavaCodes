package Codes.math;

import java.util.Scanner;

public class Areaofcircle {
    static float area(int r)
    {
        float res;
        float pi = 3.142f;
        res=pi*r*r;
        return res;
    }
        public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        System.out.println("Area of the circle  "+area(r));

    }
}

