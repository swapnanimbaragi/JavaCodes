import java.util.Scanner;

public class Pairssmallthanlarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
       
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[i])
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
