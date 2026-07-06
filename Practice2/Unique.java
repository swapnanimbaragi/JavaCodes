import java.util.Scanner;
public class Unique {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count==1)
        {
            System.out.println("Unique");
        }
        else
        {
            System.out.println("Not Unique");
        }

    }
    
}
