package Codes.math;
import java.util.Scanner;

public class Grater {
    static int grateroftwo(int a , int b)
    {
        int grater;
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(grateroftwo(a,b));
    }
    
}
