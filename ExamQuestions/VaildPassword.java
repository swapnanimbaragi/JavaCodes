package ExamQuestions;
import java.util.*;
public class VaildPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialChar = false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z')
            {
                upperCase=true;
            }
            else if(ch>='a'&& ch<='z')
            {
                lowerCase=true;
            }
            else if(ch>='0'&& ch<='9')
            {
                digit=true;
            }
            else
            {
                specialChar=true;
            }
        }
        if(upperCase && lowerCase && digit && specialChar)
        {
            System.out.println("Valid Password");
        }
        else
        {
            System.out.println("Invalid Password");
        }

        
    }
}
