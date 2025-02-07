//Question 3
/*
1
2 2 
3 3 3
 */
public class h04 
{
    public static void main(String[] args)
    {
        int n=3,count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
            }
            System.out.println();
            count++;
        }
    }    
}
