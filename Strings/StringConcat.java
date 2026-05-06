package Strings;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();
        System.out.print(input1+input2);
       
    }
}
