package SubStrings;
import java.util.*;
public class PrintSmallestWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=scan.nextLine();
        // String temp="";
        // String smallest="";
        
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch !=' ')
        //     {
        //         temp=temp+ch;
        //     }
        //     else
        //     {
        //         if(smallest.equals("") || smallest.length()>temp.length())
        //         {
        //             smallest=temp;
        //         }
        //         temp="";
        //     }
        // }
        
        // if(smallest.equals("") || smallest.length()>temp.length())
        // {
        //     smallest=temp;
        // }
        // System.out.println("Smallest word is: "+smallest);
        String[] arr=s.split(" ");
        String smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()<smallest.length())
            {
                smallest=arr[i];
            }
        }   
        System.out.println("Smallest word is: "+smallest);

    }
}

  
