public class Ternary
{
    public static void main(String args[])
    {
        int n = 5;
        int result1 = 0;
        if(n%2==0)
        result1 = 10;
        else
        result1 = 20;
        System.out.println(result1);
        // we can convert above code into ternary operator
        int a = 6;
        int result2 = 0;
        result2 = a%2==0 ? 10 : 20; // condition ? if true : if false
        // we can write 3 lines of code in one line using ternary operator 
        System.out.println(result2);
        int x = 7;
        int y = 8;
        int z = 6;
        int result3;
        // we can write if elseif code in one line 
        result3 = (x>y) ? ((x>z) ? x : z) : ((y>z) ? y : z);
        System.out.println(result3);
    }
}