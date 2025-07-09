class StaticA 
{
    static 
    {
        System.out.println("Static Block in StaticA");
    }
}

class Staticblock4 
{
    static 
    {
        System.out.println("Static Block in main method is called");
    }

    public static void main(String[] args) 
    {
        System.out.println("main");
        StaticA a = new StaticA();
    }
}
