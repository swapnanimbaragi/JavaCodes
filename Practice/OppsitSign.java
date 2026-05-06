package Practice;
import java.util.*;
public class OppsitSign {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        if((n>0 && k<0)||(n<0 && k>0))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    
    

    }
}
