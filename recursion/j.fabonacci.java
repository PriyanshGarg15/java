public class fabonacci
{
    public static int fib(int n) 
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) 
    {
        int n=3;
        int x=fib(n);
        System.out.println(x);
    }
}
