package Strings;

import java.util.Scanner;

public class RemoveConsonts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scanner.nextLine();
        String t="";
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
            ||ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') || (ch>='0' && ch<='9') || (ch==' ')|| !(ch>='A'&& ch<='Z')&& !(ch>='a' && ch<='z'))
            {
                t=t+ch;
            }
        }
        System.out.print(t);
    }
}
