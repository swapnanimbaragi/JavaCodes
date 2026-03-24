package SubStrings;
import java.util.Scanner;
public class PalendromicSubStringOfSizeK {
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
        System.out.print("Enter the size of substring: ");
        int k=scan.nextInt();
        for(int i=0;i<=s.length()-k;i++)
        {
            String t="";
            for(int j=i;j<i+k;j++)
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
