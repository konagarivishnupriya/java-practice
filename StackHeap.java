class Calculator
{
    int num = 5; // it is an instance variable
    public int add(int n1, int n2) // n1 and n2 are local variables
    //n1 and n2 are part of add method
    {
        System.out.println(num);
        return n1 + n2;
    }
}
public class StackHeap
{
    public static void main(String a[])
    {
        int data =10; // it is a local variable inside main method
        Calculator obj = new Calculator(); // obj is reference variable
        int r1 = obj.add(3,4);
        System.out.println(r1);
        Calculator obj1 = new Calculator();
        obj.num = 8; // Here we are changing num value in object obj and it will not change the num value in obj1
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}