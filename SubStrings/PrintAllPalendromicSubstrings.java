package SubStrings;
import java.util.Scanner;
public class PrintAllPalendromicSubstrings {
    static boolean isPalindrome(String s) 
    {
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
            t=t+s.charAt(i);
        }
        return t.equals(s);
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=scan.nextLine();
        for(int size=1;size<=s.length();size++)
        {
            for(int i=0;i<=s.length()-size;i++)
            {
                String t="";
                for(int j=i;j<i+size;j++)
                {
                    t=t+s.charAt(j);
                }
                if(isPalindrome(t))
                {
                    System.out.println(t);
                }
            }
        }
    }
}
