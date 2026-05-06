package Strings;
import java.util.Scanner;
public class Evenindexcharprint {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean found=false;
        for(int i=0;i<=input.length()-1;i++)
        {
            if(i%2==0)
            {
                System.out.print(input.charAt(i)+" ");
                found=true;
            }
        }
        if(!found)
        {
            System.out.print("No characters found at odd indices.");
        }
        
    }
}
}
