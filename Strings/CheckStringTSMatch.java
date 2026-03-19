package Strings;
import java.util.*;
public class CheckStringTSMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if(ch1==ch2)
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        System.out.println(j == t.length() ? "yes" : "no");    
    }
}
