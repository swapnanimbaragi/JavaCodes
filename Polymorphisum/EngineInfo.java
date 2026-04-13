package Polymorphisum;
import java.util.Scanner;
class Vehicle
{
    void startengine()
    {
        System.out.println("Vehicle has an engine");
    }
    void stopengine()
    {
        System.out.println("Vehicle engine stopped");
    }
}
class Car extends Vehicle
{
    void startengine()
    {
        System.out.println("Car engine started");
    }
    void stopengine()
    {
        System.out.println("Car engine stopped");
    }
}
class Motorcycle extends Vehicle
{
    void startengine()
    {
        System.out.println("Bike engine started");
    }
    void stopengine()
    {
        System.out.println("Bike engine stopped");
    }
}
public class EngineInfo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Vehicle v;
        if(str.equals("Car"))
        {
            v=new Car();
            v.startengine();
            v.stopengine();
        }
        else if(str.equals("Motorcycle"))
        {
            v=new Motorcycle();
            v.startengine();
            v.stopengine();
        }
        else
        {
            System.out.println("Unknown vehicle");
        }
    }
}
