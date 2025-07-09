public class Switch
{
    public static void main(String args[])
    {
        int n = 8;
        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break; 
// we write break in switch case because if we dont write break and give n = 2 for example it will print all cases after n = 2 to n = 7 
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}