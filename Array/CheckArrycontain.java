import java.util.*;
public class CheckArrycontain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the Array");
            a[i]=scan.nextInt();
        }
        System.out.print("checking value");
        int check=scan.nextInt();
        boolean found =false;
        for(int i=0;i<5;i++)
        {
        
            if(a[i]==check)
            {
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
