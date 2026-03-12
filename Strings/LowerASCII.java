package Strings;

import java.util.Scanner;

public class LowerASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        int n = scanner.nextInt();
        if(n>=97 && n<=122)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
