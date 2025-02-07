//19: Symmetric void
/*
Sample Input 1:
3
Sample Output 1:
* * * * * * 0
* *     * * 4
*         * 8
*         * 8
* *     * * 4
* * * * * * 0
Sample Input 2 :
1
Sample Output 2 :
* * 
* * 
 */
public class h19 
{
    public static void symmetry(int n) 
    {
        int levels = 3;
        for(int i=1;i<=2*n;i++)
        {
            for(int j=levels;j>=1;j--)
            {
                System.out.print("* ");
                levels--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)    
    {
        symmetry(3);
    }
}
