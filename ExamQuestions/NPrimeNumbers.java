package ExamQuestions;
import java.util.*;
public class NPrimeNumbers {
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        for(int i=n;i<=m;i++)
        {

            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
