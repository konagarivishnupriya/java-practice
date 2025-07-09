public class StaticVariable 
{
    static int stA = 100; // static variable, independent of object
    int inB = 100;        // instance variable, dependent on object

    public static void main(String[] args) 
    {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        // static variable access
        System.out.println(StaticVariable.stA);
        System.out.println(obj1.stA);

        // instance variable access
        System.out.println(obj1.inB);

        // changing values
        obj1.inB = 1000;
        obj1.stA = 2000;

        // static variable after change
        System.out.println(obj1.stA);
        System.out.println(obj2.stA);

        // instance variable after change
        System.out.println(obj1.inB);
        System.out.println(obj2.inB);
    }
}
