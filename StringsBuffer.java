public class StringsBuffer
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16 bytes is a default buffer size
        
        StringBuffer sa = new StringBuffer("Navin");
        System.out.println(sa.capacity()); // here space will change to 21. It will store the given name and give 16 bytes extra space.
        // it will give extra space to reduce the relocation of the string i.e., it gives you a buffer
        sa.append("Reddy");
        System.out.println(sa);
        String str = sa.toString();
        System.out.println(str);
        sa.deleteCharAt(3);
        System.out.println(sa);
        sa.insert(6,"java");
        System.out.println(sa);
        sa.setLength(30);
        System.out.println(sa.capacity());//new capacity = (current capacity + 1) * 2
        sa.ensureCapacity(100);
        System.out.println(sa.capacity());
        sa.delete(3,7);
        System.out.println(sa);
        sa.replace(1,4,"priya");
        System.out.println(sa);
        sa.reverse();
        System.out.println(sa);
        sa.setCharAt(0,'a');
        System.out.println(sa);

        StringBuffer a = new StringBuffer("vishnupriya");
        String sc = a.substring(3);
        System.out.println(sc);
        String sc1 = a.substring(2,9);
        System.out.println(sc1);
        System.out.println(a.length());
        System.out.println(a.charAt(3));
    }
}