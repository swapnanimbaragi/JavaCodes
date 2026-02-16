import java.util.Scanner;

public class counteven 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        int count=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("enter No");
            a[i]=scan.nextInt();
        }
        
        for(int i=0;i<5;i++)
        {
            
            if(a[i]%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
