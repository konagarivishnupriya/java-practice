class Mobile
{
    String brand;
    int price;
    static String name;
}
public class Static
{
    public static void main(String args[])
    {
        Mobile ob1 = new Mobile();
        ob1.brand = "Apple";
        ob1.price = 1000;
        ob1.name = "Smart phone";

        Mobile ob2 = new Mobile();
        ob2.brand = "Samsung";
        ob2.price = 500;
        ob2.name = "Smart phone";

        System.out.println(ob1.brand + " " + ob1.price + " " + ob1.name);
        System.out.println(ob2.brand + " " + ob2.price + " " + ob2.name);

        ob1.name = "Phone"; // after changing the ob1 automatically it changes the ob2 aswell because "name" is a static variable
        ob1.price = 2000; // it only changes ob1 and not ob2 because "price" is an instance variable.
        System.out.println(ob1.brand + " " + ob1.price + " " + ob1.name);
        System.out.println(ob2.brand + " " + ob2.price + " " + ob2.name);
    }
}