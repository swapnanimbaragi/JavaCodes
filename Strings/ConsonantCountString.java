package Strings;

import java.util.Scanner;

public class ConsonantCountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if((ch>='A' && ch<='Z')|| (ch>='a'&& ch<='z'))
            {
                if(!(ch=='A' || ch=='E'|| ch=='I' || ch=='O'||ch=='U'||
                ch=='a' || ch=='e'|| ch=='i' || ch=='o'||ch=='u'))
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
