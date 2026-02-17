import java.util.*;
public class Indexcheck 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Array");
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
            }
            
        }
        System.out.println("Not Found");
    }
    
}
    

