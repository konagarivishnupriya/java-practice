class Calculator // creating a new class called calculator
// A class is a blueprint for creating objects
{
    public int add(int n1, int n2) // Here we are defining method named add that takes two integers (n1 and n2) as input
    // it returns an integer int
    {
        int r = n1 + n2; // This line adds n1 and n2, stores the result in a local variable r
        return r; // This returns the result (r) to the place where the method was called
    } // close add method
} // close calculator class
public class Class // this defines main class
// the program starts execution from this class
{
    public static void main(String args[]) // this is main method and entry point for the program
    {
        int num1 = 4; //primitive variables
        int num2 = 5; //in this program we are not using this primitive variables but if we want to use them we can
        Calculator calc = new Calculator(); // Here calc is a reference variable that points to the new object
        // creates a new object of the calculator class
        //int result = calc.add(num1,num2); like this we can use primitive variables
        int result = calc.add(5,5); // calls the add method using the object calc, passing 4 and 5
        // Stores the returned result (which is 9) in the variable result
        System.out.println(result);
    }
}