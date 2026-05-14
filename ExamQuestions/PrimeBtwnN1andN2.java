package ExamQuestions;
import java.util.*;
public class PrimeBtwnN1andN2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        for(int i=n1; i<=n2; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
       
    }
    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
