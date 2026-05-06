package Practice;
import java.util.*;
public class StringSubarray {
    public static boolean isVowel(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();

        for(int size=n;size>=1;size--)
        {
            for(int i=0;i<=n-size;i++)
            {
                String t="";
                for (int j=i;j<i+size;j++)
                {
                    // System.out.print(str.charAt(j));
                    char ch = s.charAt(j);
                    if(ch >= 'a' && ch <= 'z')
                    {
                       t=t+ch;
                    }
                    
                    
                }
                if(isVowel(t))
                {
                    System.out.print(t); 
                //    return; // Print a newline after each substring
                }
               // Print a newline after each substring

            }
             
        }
        System.out.println(); 
    }
}
