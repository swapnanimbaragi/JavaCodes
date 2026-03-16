package Strings;
import java.util.Scanner;

public class MoveSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String letters = "";
        String specialChars = "";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9') || ch==' ')
            {
                letters=letters+ch;
            }
            else{
                specialChars+=ch;
            }

        }
        System.out.print(specialChars+letters);
    }
}
