import java.util.*;
public class Conditions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=scan.nextInt();
        if(n>=65 && n<=90)
        {
            System.out.println("UpperCase");
        }
        else{
            System.out.println("Not UpperCase");
        }
    }
    
}
