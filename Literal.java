class Literal
{
    public static void main(String a[])
    {
        // literals
        int num1 = 0b1111101; // boolean 
        int num2 = 0x7E; //hexadecimal
        int d = 10_00_000; // we have this feature in java to count the number of zero's easily 
        double num3 = 56; // it will convert automatically from integer to double
        double num4 = 12e10; //bigger number
        // boolean b = 8; will give error because we cannot convert integer to boolean
        char c = 'a'; 
        c++;
        System.out.println(d);
        System.out.println(c);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}