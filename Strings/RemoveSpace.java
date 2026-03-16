package Strings;
import java.util.*;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // String t="";
        // String s=scan.nextLine();
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch!=' ')
        //     {
        //         t=t+ch;
        //     }
        // }
        // System.out.println(t);
        int si=0,ei=0;
        String t="";
        String s=scan.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                si=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                ei=i;
                break;
            }
        }
        for(int i=si;i<=ei;i++)
        {
            t=t+s.charAt(i);
        }
        System.out.println(t); 
    }
}
