package Access_modifiers;
public class subclass
{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int a = 8;
}

// ---------------------

package to_learn_access_modifiers;
import Access_modifiers.subclass;
class Using extends subclass
{
    public void meth2()
    {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
}
public class subclass1
{
    public static void main(String[] args) 
    {
        Using c=new Using();
        c.meth2();

    }
}
