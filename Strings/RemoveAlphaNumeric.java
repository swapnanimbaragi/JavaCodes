package Strings;
import java.util.*;
public class RemoveAlphaNumeric {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
            {
                continue;
            }
            else
            {
                t=t+ch;
            }
                
            
        }
        System.out.print(t);
   } 
}
