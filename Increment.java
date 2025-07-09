class increment
{
    public static void main(String args[])
    {
        int num1 = 7;
        int result1 = num1++; // as we are using post incrementation it will first store the data then it will get incremented
        System.out.println(result1);
        System.out.println(num1);
        int num2 = 5;
        int result2 = ++num2; // as we are using pre incrementation it will increment first and then it will store the data we get after incrementation
        System.out.println(result2);
        System.out.println(num2);
    }
}