class Mobile 
{
    String brand;
    int price;
    static String name;

    public Mobile() // constructor
    {
        brand = "";
        price = 200;
        System.out.println("in constructor block");
    }

    static 
    {
        name = "phone"; // the static block will be called only once irrespective of how many objects we create     
        System.out.println("in static block");
    }
    /* java loads mobile class into memory. During class loading:
    -> The static block runs once, before any objects or constructor calls.
    -> This happens the first time the class is referenced(when you create obj1).*/
}

public class StaticBlock 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
       // java.lang.Class.forName("Mobile"); 
       /*Class.forName(String className) is a static method in Java’s Class class.
       if we want to load the class without creating object we can use "forName".
       It will load system class loader to load the class. */
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple"; 
        obj1.price = 1000;
        Mobile.name = "Smart phone";
        // even if we create 2 objects and call class twice only constructor block will be executed twice and static block will execute only once
        Mobile obj2 = new Mobile();
        // if we dont create any object then it will not call constructor and doesnt even call static block aswell.
    }
}