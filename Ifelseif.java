public class Ifelseif
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 9;
        int z = 6;
        if(x>y && x>z)
        System.out.println(x);
        else if (y>x && y>z)
        System.out.println(y);
        //if we want to compare three variables we need to use if elseif 
        else
        System.out.println(z);
    }
} 