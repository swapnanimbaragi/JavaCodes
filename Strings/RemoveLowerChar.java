package Strings;
import java.util.*;
public class RemoveLowerChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                t=t+ch;
            }
        }
        System.out.println(t);
    }
}
