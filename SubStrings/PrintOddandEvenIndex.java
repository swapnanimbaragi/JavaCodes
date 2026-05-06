package SubStrings;
import java.util.Scanner;
public class PrintOddandEvenIndex 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        for(int i=1;i<arr.length;i=i+2)
        {
            String temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for(String word : arr)
        {
            System.out.print(word+" ");
        }
        
    }
}

