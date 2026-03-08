import java.util.Scanner;
public class Endrearrangezero {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");  
        int n=scanner.nextInt();
        System.out.print("Enter the elements of the array: ");  
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int i=0,j=0;
        while(i<a.length)
        {
            if(a[i]==0)
            {
                i++;
            }
            else
            {
                a[j]=a[i];
                i++;
                j++;
            }
        }
        while(j<a.length)
        {
            a[j++]=0;
        }
        for(int x=0;x<a.length;x++)
        {
            System.out.print(a[x]+" ");
        }

    }
}
