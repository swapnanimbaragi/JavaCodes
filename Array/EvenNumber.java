import java.util.*;

public class EvenNumber {
    static boolean evennum(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scan.nextInt();
        System.out.println("Enter Numbers");
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(evennum(a[i]))
            {
                System.out.println(a[i]);
            }
            
        }
    }
}
