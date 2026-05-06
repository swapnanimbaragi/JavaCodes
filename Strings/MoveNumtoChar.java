package Strings;
import java.util.*;
public class MoveNumtoChar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String letters="";
        String number="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                number=number+ch;
            }
            else
            {
                letters=letters+ch;
            }
                
            
        }
        System.out.print(letters+number);

    }
}
