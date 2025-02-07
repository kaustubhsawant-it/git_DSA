//14: Increasing Letter Triangle
/*
Sample Input 1:
3
Sample Output 1:
A
A B
A B C
Sample Input 2 :
4
Sample Output 2 :
A
A B
A B C 
A B C D
Sample Input 3 :
7
Sample Output 3 :
A
A B
A B C 
A B C D
A B C D E
A B C D E F
A B C D E F G
 */

public class h14
{
    public static void nLetterTriangle(int n) 
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(alphabet[j-1]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        nLetterTriangle(7);
    }
}

