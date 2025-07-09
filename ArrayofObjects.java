class Student
{
    int rollno;
    String name;
    int marks;
}
public class ArrayofObjects
{
    public static void main(String args[])
    {
        // we are creating an objects manually like below
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "naveen";
        s1.marks = 76;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsha";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "subash";
        s3.marks = 80;

        System.out.println(s1); // Here it will print the address of s1

        Student students[] = new Student[3]; //Here we are not creating an Object for student class, we are creating an array which can hold Student references
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].name +" : "+ students[i].marks);
        }

        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 2;
        for(int n=0; n<nums.length; n++) //  Array has a variable/ property called length which will give actual lenth of the array 
        {
            System.out.println(nums[n]); // if we are not initialize the value of array then it will print 0 by default
        }

        for(int n=0; n<7; n++)// It will give an exception error because we initialized nums size as 6 and in loop we are taking values until 7
        //Exceptions are runtime errors
        // This is the reason we use length property. so, that we dont go out of the bond
        {
            System.out.println(nums[n]);
        }
    }
}