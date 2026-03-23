package SubStrings;
import java.util.Scanner;
public class PrintLargestPalindromeOfSubstring {
    static boolean isPalindrome(String s) 
    {
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
            t=t+s.charAt(i);
        }
        if(t.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static String findLargestPalindrome(String str) 
    {
        String t = "";
        for (int i = str.length(); i >=0; i--) 
        {
            for (int j = i; j <i + str.length(); j++) 
            {
            
                t=t+str.charAt(j);
                if(isPalindrome(t))
                {
                    System.out.print(t);
                }
            }
        }
        return t;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = findLargestPalindrome(input);
        System.out.println("Largest palindrome substring: " + result);
        
    }
}