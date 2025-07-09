public class For
{
    public static void main(String args[])
    {
        for(int i =1; i<=4; i++) // we can initialize, condition, increment in one line in for loop
        {
            System.out.println("hi" + i);
        }
        // Example for nested for loop
        for(int j =1; j<=5; j++)
        {
            System.out.println("DAY" + j); // printing working days
            for(int k=9; k<=17; k++)
            {
                System.out.println("HOUR" + k +"-"+ (k+1)); // printing each hour of office timings
            }
        }
        // we can even execute for loop by initializing and increment the variable outside the braces
        int a = 1;
        for(;a<=3;)
        {
            System.out.println(a);
            a++;
        }
    }
}