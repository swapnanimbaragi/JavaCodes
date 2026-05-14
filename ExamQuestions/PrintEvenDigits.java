package ExamQuestions;
import java.util.*;
public class PrintEvenDigits 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean found=false;
        while(n>0)
        {
            int digit=n%10;
            if(digit%2==0)
            {
                System.out.print(digit+" ");
                found=true;
            }
            n=n/10;
        }
        if(!found)
        {
            System.out.println("-1");
        }
        
    }
}
