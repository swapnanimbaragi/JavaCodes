package Polymorphisum;
import java.util.Scanner;
class Animal
{
    void sound()
    {
        System.out.println("Animal is making sound");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat is meowing");
    }
}
class Bird extends Animal
{
    void sound()
    {
        System.out.println("Bird is chirping");
    }
}
public class ImplimentSound {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Animal a;
        if(str.equals("Cat"))
        {
            a=new Cat();
            a.sound();
        }
        else if(str.equals("Bird"))
        {
            a=new Bird();
            a.sound();
        }
        else
        {
            System.out.println("Unknown animal");
        }
    }
}
