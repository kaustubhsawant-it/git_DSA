//Alpha Hill
/*
Sample Input 1:
3
Sample Output 1:
    A       4
  A B A     2
A B C B A   0

Sample Input 2 :
1
Sample Output 2 :
A

      A       6
    A B A     4 
  A B C B A   2
A B C D C B A 0

 */
public class h17 
{
    public static void alphaHill(int n) 
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        int space = (n-1)*(2);
        for(int i=1;i<=n;i++)
        {
            for(int k=space;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(alphabet[j-1]+" ");
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(alphabet[l-1]+" ");
            }
            System.out.println();
            space = space - 2;
        }
    }
    public static void main(String[] args)
    {
        alphaHill(4);
    }
}
