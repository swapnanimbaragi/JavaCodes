package Polymorphisum;

import java.util.Scanner;

class Plane
{
    void fly()
    {
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane
{
    void fly()
    {
        System.out.println("CargoPlane is flying");
    }
}
class PassengerPlane extends Plane
{
    void fly()
    {
        System.out.println("PassengerPlane is flying");
    }
}
class FighterPlane extends Plane
{
    void fly()
    {
        System.out.println("FighterPlane is flying");
    }
}

public class Polymorphisum
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
        Plane p=new Plane();
        CargoPlane c=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        FighterPlane fp=new FighterPlane();
        p.fly();
        c.fly();
        pp.fly();
        fp.fly();
    }
}