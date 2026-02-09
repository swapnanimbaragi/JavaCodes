package Patterns.datatypes;
import java.util.*;
public class Add {
    static void Sum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a and b value");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        {
            System.out.println();
            Sum();
        }
    }
}
