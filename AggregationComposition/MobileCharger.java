package AggregationComposition;
class OS {
    private String name;
    private int size;

    public OS(String name, int size) 
    {
        this.name = name;
        this.size = size;
    }

    public void displayOS() 
    {
        System.out.println(name);
        System.out.println(size);
    }
}

// Charger Class (Aggregation)
class Charger 
{
    private String brand;
    private float voltage;

    public Charger(String brand, float voltage) 
    {
        this.brand = brand;
        this.voltage = voltage;
    }

    public void displayCharger() 
    {
        System.out.println(brand);
        System.out.println(voltage);
    }
}

// Mobile Class
class Mobile 
{
    private OS os;

    public Mobile(OS os) 
    {
        this.os = os;
    }

    public void displayMobile() 
    {
        if (os != null) 
        {
            os.displayOS();
        }
    }

    public void hasA(Charger c) {
        if (c != null) {
            c.displayCharger();
        }
    }
}

// Main Class (ONLY public class)
public class MobileCharger {
    public static void main(String[] args) {

        OS os = new OS("Android", 512);
        Charger charger = new Charger("Samsung", 24.5f);

        Mobile mobile = new Mobile(os);

        mobile.displayMobile();
        mobile.hasA(charger);
    }
}