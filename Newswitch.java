public class Newswitch
{
    public static void main(String args[])
    {
        String day = "Monday";
        String result = "";
        switch(day)
        {
            case "Saturday" , "Sunday" -> result = "6am";
            case "Monday"-> result = "8am";
            default -> result= "7am";
        }
        System.out.println(result);
        // we can use another method to execute without writing result 3 times rather fetching it directly from switch statement by writing it once
        result = switch(day)
        {
            case "Saturday" , "Sunday" -> "6am";
            case "Monday"-> "8am";
            default -> "7am";
        };
        System.out.println(result);
        // we can even use keyword yield if we want to use : instead of ->
        result = switch(day)
        {
            case "Saturday" , "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };
        System.out.println(result);
    }
}