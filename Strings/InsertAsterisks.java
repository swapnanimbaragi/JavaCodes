package Strings;
import java.util.Scanner;
public class InsertAsterisks {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=scan.next();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            t+=s.charAt(i);
            if(i!=s.length()-1)
            {
                t+='*';
            }
        }
        System.out.println("After insertion of asterisks" + t);

    }
}
