public class While
{
    public static void main(String args[])
    {
        int i = 1;
        while(i<5) // this loop will continue until it satisfies the condition
        {
            System.out.println("hi" + i); // when you want concatenate 2 things you can use + symbol 
            i++;
        }
        System.out.println("bye" + i); // This statement is going to print only once because it is outside the loop
        int a = 1;
        while(a<5)
        {
            System.out.println("a" + a);
            int b =1; // we need to intialize b inside the loop so that everytime the loop start 'b' value becomes 1 again
            while(b<4) // we can even write one more while loop in 1 while loop
            {
                System.out.println("b" + b);
                b++;
            }
            a++;
        }
    }
}