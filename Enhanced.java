class Student
{
    int rollno;
    String name;
    int marks;
}
public class Enhanced
{
    public static void main(String args[])
    {
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

        Student students[] = new Student[3]; 
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stud : students) //stud represents one student at a time
        // Student is a type which can store stud value 
        {
            System.out.println(stud.name +" : "+ stud.marks);
        }

        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        for(int n : nums) // Here it will take one num value and store it in 'n' at each time
        {
           System.out.println(n); 
        }
    }
}