package Strings;
import java.util.Scanner;
public class Palindromechecker {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i=0 ,j=input.length()-1;
        while(i<j)
        {
            if(input.charAt(i)==input.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
        
    }
}

