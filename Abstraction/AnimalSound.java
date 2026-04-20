package Abstraction;
import java.util.*;
abstract class Animal {
    abstract void makeSound();   // abstract method
}
class Lion extends Animal
{
    void makeSound()
    {
        System.out.println("Roar");
    }
}
class Tiger extends Animal
{
    void makeSound()
    {
        System.out.println("Growl");
    }
}
public class AnimalSound {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        Animal a;
        if(animal.equalsIgnoreCase("Lion"))
        {
            a = new Lion();
            a.makeSound();
        }
        else if(animal.equalsIgnoreCase("Tiger"))
        {
            a = new Tiger();
            a.makeSound();
        }
        else
        {
            System.out.println("Unknown animal");
        }
    }
}

