public class Strings
{
    public static void main(String args[])
    {
       String name =  "priya"; // we are creating object by Directly assigning sequence of characters by putting them in ""
       //String name = new String("priya"); -> we are creating by using new operator 
       System.out.println(name); 
       System.out.println(name.charAt(1)); //to find character at particular index
       System.out.println(name.concat(" reddy")); // to concatinate a string with some comment
       System.out.println(name.length()); // in array length is property, while in string length() is method 
       //it gives number of characters in string
      
       String firstName = "Vishnu";
       String lastName = "priya";
       String fullName = firstName + lastName;
       System.out.println(fullName);
       
       String s = "navin"; // here in stack it will create a varible s and the character array "navin" is stored in heap
       s = s + " Reddy"; // here in heap it will not change the exsisting object in heap by adding "reddy" to it 
       // But it will create a new object in heap memory with new address to it. So, it will only change the address of name in stack memory to the new object address.
       // the old object will be removed by garbage collection after sometime just to get some memory back.
       System.out.println(s);
       
       String s1 = "Navin"; // there is a string constant pool in heap memory
       // It will allocate address (ex:103) for s1 in  memory and then when we want to allocate s2 it will check if the same string is already present in heap memory or not
       // after checking it will find "Navin" in heap memory with 103 address, then it will refer s2 to same address as s1 (i.e., 103)
       String s2 = "Navin";
       System.out.println(s1 == s2);
       String s3 = new String("Navin");
       System.out.println(s1==s3); // here it will get false because new can create new string object so s1 and s3 are in different address in heap memory
    }
}