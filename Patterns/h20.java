//20: Symmetry
/*
Sample Input 1:
3
Sample Output 1:
*         *  8
* *     * *  4
* * * * * *  0
* *     * *  4 
*         *  8
Sample Input 2 :
1
Sample Output 2 :
*

*/
public class h20 {
    public static void symmetry(int n) 
    {
        int space = (n-1)*(i-1);
        for (int i = 0; i < 10; i++) 
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=space;k>=1;k--)
            {

            }
        }
    }
    public static void main(String[] args)
    {

    }
}
