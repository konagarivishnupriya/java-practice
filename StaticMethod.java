class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : "+price+" : "+name);
    }

    public static void show1(Mobile obj) // we cannot use non static method inside the static method without object creation
    {
        System.out.println(obj.brand + " : "+obj.price+" : "+name);

    }
}
public class StaticMethod
{
    public static void main(String args[])
    {   
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        obj1.name = "Smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 500;
        obj2.name = "Smart phone";

        Mobile.show1(obj1); 
        // we have to mention which object we are calling to avoid confusion while using non static properties in static method
        Mobile.show1(obj2);
    }
}