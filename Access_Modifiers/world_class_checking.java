//suppose we are creating this class in package called as Access_modifiers
package Access_modifiers;

public class c1 
{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int a = 8;
}
//suppose we had import this class in package called as Strings
package Strings;
import Access_modifiers.c1;

public class test {
    public static void main(String[] args) {
        c1 c = new c1();
        System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
    }
}
