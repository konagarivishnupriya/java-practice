public class Array
{
    public static void main(String args[])
    {
        char ch[] = new char[3]; // we can specify the values dynamically
        for(int i=0; i<ch.length; i++)
        System.out.println("ch["+i+"]="+ch[i]);
        ch[0] = 'a';
        ch[1] = 'b';
        ch[2] = 'c';
        for(int i=0; i<ch.length; i++)
        System.out.println(ch[i]);
        int nums[] = {2,3,4,5}; // if we already have values we can keep assign them here
        for(int i=1; i<nums.length; i++) 
        // when we initialize i from 1 then 1st value will not be fetched and printed because array position starts from 0
        System.out.println("nums["+i+"]="+nums[i]);
        int num[] = new int[4];
        num[0]=10;
        num[1]=11;
        num[2]=22;
        num[3]=33;
        for(int i=0; i<num.length; i++)
        System.out.println("num["+i+"]="+nums[i]);
        int num1[] = {3,7,2,4};
        num1[1] = 6;
        System.out.println("num1[1]="+num1[1]);
    }
}