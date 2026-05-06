package Practice;
import java.util.*;
public class MaximumOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a>b && a>c && a>d)
        {
            System.out.println("Maximum number is: " + a);
        }
        else if(b>a && b>c && b>d)
        {
            System.out.println("Maximum number is: " + b);
        }
        else if(c>a && c>b && c>d)
        {
            System.out.println("Maximum number is: " + c);
        }
        else
        {
            System.out.println("Maximum number is: " + d);
        }
    }
}
