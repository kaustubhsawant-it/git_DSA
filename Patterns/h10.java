

/* 
*
**
***
**
*

*/

public class h10
{
    public static void nStarTriangle(int n) 
    {
        int dec = n-1;
        for(int i=1;i<=(2*n-1);i++)        
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i>n)
            {
                for(int j=dec;j>=1;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
                dec--;
            }
            
        }
    }
    public static void main(String[] args)
    {
        nStarTriangle(6);
    }
}