public class Dowhile
{
    public static void main(String args[])
    {
        int i = 5;
        do
        {
            System.out.println("Hi" + i); // It will print atleast once even if the condition is false because it will check condition after printing the statement 
            i++;
        }while(i<=4);
        int a = 1;
        do
        {
            System.out.println(a);
            a++;
        }while(a<=4);
    }
}