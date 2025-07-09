class StaticBlock2 
{
    static int count;


    static 
    {
        count = 1;
        System.out.println("Static Block 1: count = " + count);
    }

    static 
    {
        if (count == 1) 
        {
            count += 9;
        }
        System.out.println("Static Block 2: count = " + count);
    }

    public static void main(String[] args) 
    {
        System.out.println("main: count = " + count);
    }
}
