package Strings;

import java.util.Scanner;

public class SpecialCharPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean found=false;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z') && !(ch>='0' && ch<='9'))
            {
                System.out.print(ch+" ");
                found=true;
            }
        }
        if(!found)
        {
            System.out.print("No special characters found.");
        }
       
    }
}
