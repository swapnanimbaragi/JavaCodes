
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
}
