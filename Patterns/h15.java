//15: Reverse Letter Triangle
/*
Sample Input 1:
3
Sample Output 1:
A B C
A B
A
Sample Input 2 :
4
Sample Output 2 :
A B C D
A B C
A B
A
Sample Input 3 :
7
Sample Output 3 :
A B C D E F G 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
 */
public class h15 {
    public static void nLetterTriangle(int n)
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        for(int i=n;i>=1;i--)
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
