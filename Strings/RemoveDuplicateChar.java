package Strings;
import java.util.*;
public class RemoveDuplicateChar {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int found=0;
            for(int j=0; j<t.length();j++)
            {
                if(ch==t.charAt(j))
                {
                    found=1;
                    break;
                }
            }
            if(found==0)
            {
                t=t+ch;
            }
        }
        System.out.print("After Removing duplicate:"+t);
    }
}

