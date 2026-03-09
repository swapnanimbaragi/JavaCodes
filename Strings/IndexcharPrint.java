package Strings;
import java.util.Scanner;
public class IndexcharPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
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