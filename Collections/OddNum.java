package Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class OddNum 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        ArrayList list=new ArrayList();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=scan.nextInt();
            if(num%2!=0)
            {
                list.add(num);
            }
        }
        System.out.println("Odd:"+list);
    }
}
