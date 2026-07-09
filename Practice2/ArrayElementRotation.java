import java.util.Scanner;
// Left Rotation of an array by d elements
public class ArrayElementRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        // Left Rotation of an array by d elements
        // for(int r=1;r<=d;r++)
        // {
        //     int temp=arr[0];
        //     for(int i=0;i<n-1;i++)
        //     {
        //         arr[i]=arr[i+1];
        //     }
        //     arr[n-1]=temp;
        // }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // Right Rotation of an array by d elements
        for (int r = 1; r <= d; r++) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


