package Strings;

import java.util.Scanner;

public class countVowConsSChara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vc=0, cc=0, sc=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                if((ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' ||
                ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
                {
                    vc++;
                }
                else
                {
                    cc++;
                }

            }
            else if(!(ch>='0' && ch<='9'))
            {
                sc++;
            }
        }
        System.out.println("Vowels: " + vc);
        System.out.println("Consonants: " + cc);
        System.out.print("Special Characters: " + sc);
    }
}
