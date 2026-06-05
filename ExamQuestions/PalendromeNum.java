package ExamQuestions;
import java.util.*;
public class PalendromeNum {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int originalNum=num;
        int reversedNum=0;
        while(num>0)
        {
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
            num=num/10;
        }
        if(originalNum==reversedNum)
        {
            System.out.println("It is a Palindrome");
        }  
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
