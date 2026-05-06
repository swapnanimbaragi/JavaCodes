package Practice;
import java.util.*;
public class VowelAsciiCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int asciiValue = sc.nextInt();
        if(asciiValue==65 || asciiValue==69 || asciiValue==73 || asciiValue==79 || asciiValue==85 || asciiValue==97 || asciiValue==101 || asciiValue==105 || asciiValue==111 || asciiValue==117)
        {
            System.out.println("The ASCII value corresponds to a vowel.");
        }
        else
        {
            System.out.println("The ASCII value does not correspond to a vowel.");
        }
    }
}
