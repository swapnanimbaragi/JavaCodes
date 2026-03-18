package Codes.math;
import java.util.Scanner;
public class Avg {
    static int num(int a ,int b,int c)
    {
        int avg;
        avg=(a+b+c)/3;
        return avg;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println("Average"+num(a,b,c));
    }
}
