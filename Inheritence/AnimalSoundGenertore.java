package Inheritence;
import java.util.*;
class Animal
{
    private String name;
    private String age;
    private String sound;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getSound() {
        return sound;
    }
    public String getInfo()
    {
        return "";
    }
}
class Dog extends Animal
{
    private String breed;
    public void setBreed(String breed) 
    {
        this.breed = breed;
    }
    public String getBreed() 
    {
        return breed;
    }
    @Override
    public String getSound() 
    {
        return "bark";
    }
}
class Cat extends Animal
{
    private String color;
    public void setColor(String color) 
    {
        this.color = color;
    }
    public String getColor() 
    {
        return color;
    }
    @Override
    public String getSound() 
    {
        return "meow";
    }
}
public class AnimalSoundGenertore {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        if (type.equalsIgnoreCase("Dog"))
        {
            String data[]=scan.nextLine().split(",");
            Dog dog = new Dog();
            dog.setName(data[0]);
            dog.setAge(data[1]);
            dog.setBreed(data[2]);
            System.out.println("Animal Sound: " + dog.getSound());
        }
        else if (type.equalsIgnoreCase("Cat"))
        {
            String data[]=scan.nextLine().split(",");
            Cat cat = new Cat();
            cat.setName(data[0]);
            cat.setAge(data[1]);
            cat.setColor(data[2]);
            System.out.println("Animal Sound: " + cat.getSound());  
        }
    }
}
