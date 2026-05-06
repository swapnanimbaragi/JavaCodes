package SubStrings;

import java.util.Scanner;

public class LargestWord 
{
    public static void main(String[] args) 
    {   
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String []arr=s.split(" ");
        String largest =arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i].length() > largest.length())
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest word is: "+largest);
    }
}
