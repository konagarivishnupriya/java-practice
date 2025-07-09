class Casting
{
    public static void main(String a[])
    {
        byte b = 127;
        int n = b; // Doing implicit conversion
        int m = 257;
        byte k = (byte) m; // Doing explicit conversion
        float f = 5.6f;
        int t = (int) f;// explicit conversion of float to int
        System.out.println(n);
        System.out.println(k);
        System.out.println(t);
    }
}