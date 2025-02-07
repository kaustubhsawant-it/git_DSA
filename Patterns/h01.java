//Patterns Question 1
/* 
Output: 
* * *
* * *
* * *
*/

public class h01
{
    public static void main(String[] args)
    {
        int n= 4;
        for(int x =1;x<=n;x++)
        {
            for(int y=1;y<=n;y++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}