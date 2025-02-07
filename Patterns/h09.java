/*
 *
 ***
*****
*****
 ***
 *
 */

public class h09 
{
    public static void nStarDiamond(int n) 
    {
        int space_dec= n-1;
        int space_inc = 1;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=space_dec;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            space_dec--;
        }
        

        for(int i=n;i>=1;i--)
        {
            for(int j=(2*i)-1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            for(int k=1;k<=space_inc;k++)
            {
                System.out.print(" ");
            }
            space_inc++;
        } 
    }
    public static void main(String[] args)
    {
        nStarDiamond(3);
    }
}
