/*
11: Binary Number Triangle
1
0 1
1 0 1
 */
public class h11
{
    public static void nBinaryTriangle(int n) 
    {
        for(int i=1;i<=n;i++)        
        {
            for(int j=i;j>=1;j--)
            {
                int res = j%2==0 ? 0 : 1;
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        nBinaryTriangle(4);
    }
}