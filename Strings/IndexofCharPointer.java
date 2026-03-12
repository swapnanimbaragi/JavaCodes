package Strings;
import java.util.Scanner;

public class IndexofCharPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the index: ");
        int k=scanner.nextInt();
        if(input.isEmpty()||k<0 || k>=input.length())
        {
            System.out.print("Invalid index");
        }
        else
        {
            System.out.print(input.charAt(k));
        }
        
       
    }
}

