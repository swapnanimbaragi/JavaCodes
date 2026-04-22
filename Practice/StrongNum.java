package Practice;
import java.util.*;
public class  StrongNum {
    public static int isFactorial (int n)
    {
        int fact = 1;
        for(int i = 1; i <= n; i++)   // ✔ fixed
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();   // input

        for(int num = 1; num <= n; num++)   // ✔ loop till n
        {
            int temp = num;
            int sum = 0;

            while(temp > 0)
            {
                int digit = temp % 10;
                sum += isFactorial(digit);
                temp /= 10;
            }

            if(sum == num)
            {
                System.out.print(num + " ");
            }
            else{
                System.out.print("No Strong Number");
            }
        }
    }
}

