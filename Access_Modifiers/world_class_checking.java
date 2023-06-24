//suppose we have package Access_modifiers having file named as subclass.java
package Access_modifiers;
public class subclass
{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int a = 8;
}

//suppose we had import this class in package called as Strings having class named as subclass1
package Strings;
import Access_modifiers.subclass;
public class subclass1
{
    public static void main(String[] args) 
    {
        subclass c=new subclass();
        System.out.println(c.x);
    //  System.out.println(c.y);
    //  System.out.println(c.z);
    //  System.out.println(c.a);
    }
}
