public class Examplewhile
{
    public static void main( String args[])
    {
        int a = 1;
        while(a<=7)
        {
            System.out.println("Day" + a); // Days in a week
            int b = 1;
            while(b<=24)
            {
                System.out.println("Hour" + b); // Hours per day
                b++;
            }
            a++;
        }
    }
}