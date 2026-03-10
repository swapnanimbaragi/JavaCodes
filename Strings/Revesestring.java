package Strings;

import java.util.Scanner;

public class Revesestring {
    private static String reverseString(String s){
        //Your code here
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
            t = t + s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseString(input));
    }
}
}
