package SubStrings;
import java.util.*;
public class CountNoOfOccurance {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String s2=scan.nextLine();
        int count=0;
        for(int i=0;i<s.length()-s2.length()+1;i++)
        {
            String t="";
            for(int j=i;j<i+s2.length();j++)
            {
                t=t+s.charAt(j);
            }
            if(t.equals(s2))
            {
                count++;
            }
        }
        System.out.println("Number of Occurance of "+s2+" is: "+count);
    }
}
