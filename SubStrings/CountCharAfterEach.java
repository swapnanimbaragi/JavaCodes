package SubStrings;
import java.util.Scanner;
public class CountCharAfterEach {
    public static void main(String[] args) 
    {    
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            String temp=arr[i];
            for(int j=0;j<temp.length();j++)
            {
                
                {
                    count++;
                }
            }
        }
        System.out.println("Count of 'a' characters: " + count);
    }
}
