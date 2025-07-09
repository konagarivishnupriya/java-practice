class Computer
{
    public void playmusic()
    {
        System.out.println("Music playing..");
    }
    public String getmeapen(int cost)
    {
        if(cost >= 10)
            return "pen";
        //else
            return "Nothing"; 
        // even if we don't write else it will not execute this statment if (if condition) is true and returning the pen
    }
}
public class Method
{
   public static void main(String args[])
   {
    Computer obj = new Computer(); // This is a line we use to create a object
    // new Computer() is actually getting a object and obj is a reference variable
    obj.playmusic();
    String str = obj.getmeapen(2);
    System.out.println(str);
   }
}