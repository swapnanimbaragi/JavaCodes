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
        return t.equals(s);
    }
    
    static String findLargestPalindrome(String str) 
    {
        String largest = "";   

        for (int i = 0; i < str.length(); i++)   
        {
            for (int j = i; j < str.length(); j++)   
            {
                String t = "";   

                for(int k = i; k <= j; k++)   
                {
                    t = t + str.charAt(k);
                }

                if(isPalindrome(t) && t.length() > largest.length())
                {
                    largest = t;   
                }
            }
        }
        return largest;   
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = findLargestPalindrome(input);
        System.out.println("Largest palindrome substring: " + result);
    }
}