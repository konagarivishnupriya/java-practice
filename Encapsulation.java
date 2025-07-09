class Human
{
    private int age;
    private String name;
    public int getAge() // we are using methods to fetch the private data 
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
class Encapsulation
{
    public static void main (String args[])
    {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("vishnupriya");
        System.out.println(obj.getName()+" : "+obj.getAge());
    // we are binding our data 
    }
}