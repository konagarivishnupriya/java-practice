class Logical
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 5;
        int a = 6;
        int b= 9;
        boolean r1 = x > y && a > b; // we are using and operator
        boolean r2 = x > y || a > b; // OR operator
        // we can use even &, | symbol once but we are typing double times to short circuit, which helps in saving time
        boolean r3 = ! r2; // By using not operator we are changing the result in to opposite
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}