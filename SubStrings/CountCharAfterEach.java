package SubStrings;
import java.util.Scanner;
public class CountCharAfterEach {
    public static void main(String[] args) 
    {    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        for(String word : arr)
        {
            System.out.println(word+word.length()+" ");
        }
    }
}
