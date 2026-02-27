import java.util.Scanner;

public class LargestRepetingNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        
        boolean flag=false;
        int max=-1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1] && a[i]>max)
            {
               
                max=a[i];
                flag=true;
            }           
        }
        if(flag )
        {
            System.out.print(max);
        }
        else{
            System.out.print(-1);
        }
           
    }
}
