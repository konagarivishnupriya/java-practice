public class Ifelse
{
    public static void main(String args[])
    {
        int x = 8;
        if(x>10)
        System.out.println("X is below 10"); //does't print beacuse it doesn't satisfy the condition
        // in java it doesn't need indentation like you no need to give tab space in front to specify it is a part of the if block as python
        if(true) 
        System.out.println("hello");
        if(false) // as we kept condition as false it doesnt print the statement bye
        System.out.println("bye");
        int y = 18;
        if(y>10 && y<20)
        System.out.println("y is between 10 and 20"); // it will print beacuse it satisfies both the conditions
        int z = 28;
        if(z>10 && z<20)
        System.out.println("Z is between 10 and 20");
        else
        System.out.println("Z is not between 10 and 20");
        int a = 5;
        int b = 7;
        if(a>b) // Another simple example 
        System.out.println(a);
        else
        {
            System.out.println(b);
            System.out.println("thankyou");
            //if we have more than one statement in if/else block we need to use the braces
        }
    }
}