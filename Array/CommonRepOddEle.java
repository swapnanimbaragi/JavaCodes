import java.util.Scanner;

public class CommonRepOddEle {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            a2[i]=scanner.nextInt();
        }
        int count=0;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j] && a1[i]%2 !=0 )
                {
                    System.out.print(a1[i]+" ");
                    count++;
                    break;
                }
            }
        }
        if(count==0)
        {
            System.out.print("No common odd elements found."); 
        }
        
    }
}
