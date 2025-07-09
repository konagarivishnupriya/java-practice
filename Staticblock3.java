public class Staticblock3
{
    static int val;
    static void update() // This is a static method which can be called without creating a object.
    {
        val += 10;
        System.out.println("Update() is called:"+val);
    }
    public void valupdate() // It is a non static method which requires object to be called.
    {
        val += 15;
        System.out.println("returned value:"+val);
    }
    static //runs once when the class loads
    {
        val = 5;
        System.out.println("Static Block:"+val);
        Staticblock3 obj = new Staticblock3();
        obj.valupdate();
        update();       
    }
   /* In Java, static blocks run when the class is loaded into memory by the JVM, before the main method starts executing.

So the flow is:
1️⃣ JVM loads the class → executes static blocks (exactly once).
2️⃣ Then JVM calls main() → starts program’s main execution flow.

That’s why you see the static block output before anything from main.

In short: Class initialization (static blocks) happens before main() runs.*/

    public static void main(String args[])
    {
        /*Staticblock3 obj = new Staticblock3();
        obj.valupdate();*/
        System.out.println("main val:"+val);
    }
}