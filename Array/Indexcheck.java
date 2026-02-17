import java.util.*;
public class Indexcheck 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter Array");
        for(int i=0;i<5;i++)
        {
            
            a[i]=scan.nextInt();
        }
        System.out.println("cheking value");
        int check =scan.nextInt();
        boolean found =false;
        for(int i=0;i<5;i++)
        {
            if(a[i]==check)
            {
                System.out.println(i);
                found =true;
                break;
            }
        }
        if(found==true)
        {
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
           
    }
    
}
    

