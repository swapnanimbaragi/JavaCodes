import java.util.Scanner;

public class CountUnique {
        public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int N = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=scanner.nextInt();
        }
        int count=1;
        int uniquecount=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
            }
            else
            {
                if(count==1)
                {
                    uniquecount++;
                }
                count=1;
            }
        }
        if(count==1)
        {
            uniquecount++;
        }
        System.out.print("Unique elements count: "+uniquecount);
    }
    
}
