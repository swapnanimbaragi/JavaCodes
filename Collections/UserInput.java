package Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList list=new ArrayList();
        for(int i=0;i<5;i++)
        {
            int num=scanner.nextInt();
            list.add(num);
        }
    }
}
