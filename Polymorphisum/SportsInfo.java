package Polymorphisum;
import java.util.Scanner;   
class Sports
{
    void info()
    {
        System.out.println("Sports is a physical activity");
    }
}
class Football extends Sports
{
    void info()
    {
        System.out.println("playing football on the field");
    }
}
class Basketball extends Sports
{
    void info()
    {
        System.out.println("playing basketball on the court");
    }
}
class Rugby extends Sports
{
    void info()
    {
        System.out.println("playing rugby on the pitch");
    }
}
public class SportsInfo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Sports sp;
        if(str.equals("Football"))
        {
            sp=new Football();
            sp.info();
        }
        else if(str.equals("Basketball"))
        {
            sp=new Basketball();
            sp.info();
        }
        else if(str.equals("Rugby"))
        {
            sp=new Rugby();
            sp.info();
        }
        // else
        // {
        //     System.out.println("Unknown sport");
        // }
    }
}
