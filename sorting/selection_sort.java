public class selection_sort
{
    public static void bubble(int[] n)
    {
        int k=n.length;
        for(int i=0;i<k-1;i++)
        {
            int min=i;
            for(int j=i+1;j<k;j++)
            {
                if(n[j]<n[min])
                {
                    min=j;
                }
                
            }
            int temp=n[min];
            n[min]=n[i];
            n[i]=temp;
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
    int[] n={5,4,8,7,1};
    bubble(n);
    }
}
