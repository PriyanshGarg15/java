public class bubble_sort
{
    public static void bubble(int[] n)
    {
        int count=0;
        int k=n.length;
        for(int turn=0;turn<k-1;turn++)
        {
            for(int j=0;j<k-1-turn;j++)
            {
                if(n[j]>n[j+1])
                {
                    int temp=n[j+1];
                    n[j+1]=n[j];
                    n[j]=temp;
                    count+=1;

                }

            }
            if(count==0)
            {
                System.out.println("already sorted");
                break;
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
    int[] n={1,2,3,4};
    bubble(n);
    }
}
