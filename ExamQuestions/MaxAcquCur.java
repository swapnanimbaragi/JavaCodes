package ExamQuestions;
import java.util.*;
public class MaxAcquCur {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int n=scanner.nextInt();
        for(int i=0;i<s.length();i++)
        {
            // Process each character
                char c = s.charAt(i);
                if(Character.isDigit(c))
                {
                    int digit = Character.getNumericValue(c);
                    int result = (digit * n) % 10;
                    System.out.print(result);
                }
                else{
                    System.out.print(c);
                }
        }
    }
}
