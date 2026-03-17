package Strings;
import java.util.*;
public class LowertoUpperConvert {
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                t=t+(char)(ch-32);
            }
            else{
                t=t+ch;
            }
        }
        System.out.println(t);
    }
}
