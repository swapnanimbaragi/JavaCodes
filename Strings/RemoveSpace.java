package Strings;
import java.util.*;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String t="";
        String s=scan.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                t=t+ch;
            }
        }
        System.out.println(t);
    }
}
