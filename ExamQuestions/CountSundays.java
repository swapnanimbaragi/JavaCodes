package ExamQuestions;
import java.util.*;
public class CountSundays 
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.next();
        int n = scanner.nextInt();

        int daysToSunday = 0;

        if(day.equals("mon")) {
            daysToSunday = 6;
        }
        else if(day.equals("tue")) {
            daysToSunday = 5;
        }
        else if(day.equals("wed")) {
            daysToSunday = 4;
        }
        else if(day.equals("thu")) {
            daysToSunday = 3;
        }
        else if(day.equals("fri")) {
            daysToSunday = 2;
        }
        else if(day.equals("sat")) {
            daysToSunday = 1;
        }
        else {
            daysToSunday = 0;
        }

        int count = 0;

        if(n > daysToSunday) 
        {

            count = 1;

            n = n - (daysToSunday + 1);

            count = count + (n / 7);
        }

        System.out.println(count);
    }
}
