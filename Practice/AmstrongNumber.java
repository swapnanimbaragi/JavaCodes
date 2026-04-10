package Practice;
import java.util.*;
public class AmstrongNumber {
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int count = String.valueOf(num).length();
        int arm = 0;
        while (num > 0) 
        {
            int last= num % 10;
            arm = arm + (int)Math.pow(last, count);
            num = num / 10;
        }
        System.out.println("The Armstrong number is: "+arm);


    }
}
