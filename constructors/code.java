class Constructortry
{
	private String name;
	private int sal;

	Constructortry()
	{
		name="DEFAULT";
		sal=00;
	}
	Constructortry(int s)
	{
		name="Overload";
		sal=s;
	}
    Constructortry(String s)
	{
		name=s;
		sal=10;
	}
	public int getSal()
	{
		return sal;
	}
}

public class tests
{
	public static void main(String[] args) 
	{
		Constructortry ob=new Constructortry();		
		Constructortry ob2=new Constructortry(10000);
        Constructortry ob3=new Constructortry("PG");

		System.out.println(ob.getSal());
		System.out.println(ob2.getSal());
        System.out.println(ob3.getSal());

	}
    
}

