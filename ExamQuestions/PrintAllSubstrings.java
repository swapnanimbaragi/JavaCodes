package ExamQuestions;
import java.util.*;
public class PrintAllSubstrings 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        for(int size=1;size<=s.length();size++)
        {
            for(int i=0;i<=s.length()-size;i++)
            {
                for(int j=i;j<i+size;j++)
                {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        }
    }
}
