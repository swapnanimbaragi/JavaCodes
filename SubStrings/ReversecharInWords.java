package SubStrings;
import java.util.Scanner;
public class ReversecharInWords {
    public static void main(String[] args) 
    {    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        for(String word : arr)
        {
            String rev="";
            for(int i=word.length()-1;i>=0;i--)
            {
                rev=rev+word.charAt(i);
            }
            System.out.print(rev+" ");
        }
    }
}
