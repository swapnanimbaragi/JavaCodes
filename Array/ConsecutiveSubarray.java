import java.util.*;
public class ConsecutiveSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the elements of the array: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
    
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]-a[i]==1)
            {
                System.out.print(a[i]+" ");
            }
            else{
                System.out.print(a[i]);
                System.out.println();
                
            }
        }
        System.out.print(a[a.length-1]);
    }
}