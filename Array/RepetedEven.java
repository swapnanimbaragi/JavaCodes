import java.util.Scanner;

public class RepetedEven {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n = scanner.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int a2[]=new int[n2];
        for(int j=0;j<a2.length;j++)
        {
            a2[j]=scanner.nextInt();
        }
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    if(a1[i]%2==0)
                    {
                        System.out.print(a1[i]+" ");
                            break;
                    }
                    
                }
                
            }
        }
       
    }
}
