package Abstraction;
import java.util.*;
abstract class ThreeD {
    float volume;
    abstract void acceptInput(Scanner sc);      // abstract method
    abstract void calculateVolume();   // abstract method
}
class Cube extends ThreeD
{
    float side;
    void acceptInput(Scanner sc)
    {
        
        side = sc.nextFloat();
    }
    void calculateVolume()
    {
        volume = side * side * side;
        System.out.printf("Volume of cube: %.2f", volume);
    }
}
class Cylinder extends ThreeD
{
    float radius, height;
    void acceptInput(Scanner sc)
    {
        radius = sc.nextFloat();
        height = sc.nextFloat();
    }
    void calculateVolume()
    {
        volume =(float)( Math.PI * radius * radius * height);
        System.out.printf("Volume of cylinder: %.2f", volume);
    }
}
class Sphere extends ThreeD
{
    float radius;
    void acceptInput(Scanner sc)
    {
        
        radius = sc.nextFloat();
    }
    void calculateVolume()
    {
        volume =(float)( (4.0/3.0) * Math.PI * radius * radius * radius);
        System.out.printf("Volume of sphere: %.2f", volume);
    }
}
public class ThreeDShape {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String shapeType = sc.nextLine();
        ThreeD s;
        if(shapeType.equalsIgnoreCase("Cube"))
        {
            s = new Cube();
            s.acceptInput(sc);
            s.calculateVolume();
        }
        else if(shapeType.equalsIgnoreCase("Cylinder"))
        {
            s = new Cylinder();
            s.acceptInput(sc);
            s.calculateVolume();
        }
        else if(shapeType.equalsIgnoreCase("Sphere"))
        {
            s = new Sphere();
            s.acceptInput(sc);
            s.calculateVolume();
        }
        else
        {
            System.out.println("Invalid shape type");
        }
    }
}
