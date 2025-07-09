public class Multidimensional
{
    public static void main(String args[])
    {
        int nums[][] = new int[3][4];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                nums[i][j] = (int)(Math.random() *10); //random returns a double value in between o to 1. So, we are doing type casting and also multiplying by 10
                // in above statement we are fetching random values
                // we have Math class (library)in java which will help in fetching random values, It is a in-built class
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int n[] : nums) //Enhanced for loop
        // n is not a simple variable, it is a single dimensional array
        {
            for(int m: n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
