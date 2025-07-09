class Cal
{
    public int add(int n1, int n2, int n3)
    {
        //int result = n1 + n2 + n3;
        return n1 + n2 + n3; // rather than using another variable result we can do simple logic in return 
    }
    public int add(int n1, int n2) // we have same method name but different number of parameters
    {
        return n1 + n2;
    }
    public double add(double n1, int n2) // we have same method name & same number of parameters but different different type of parameter
    {
        return n1 + n2;
        //return doesn't matter here
    }
}
public class Overloading
{
    public static void main(String a[])
    {
        Cal obj = new Cal();
        double r1 = obj.add(3,4,7);
        System.out.println(r1);
    }
}