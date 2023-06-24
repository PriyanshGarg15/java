package Access_modifiers;
class c1
{
    public int x=5;
    protected int y=6;
    int z=7;
    private int a=8;

}

public class packagee
{
    public static void main(String[] args)  
    {
        c1 c=new c1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        System.out.println(c.a);

    }
}
