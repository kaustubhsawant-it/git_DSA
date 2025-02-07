//18: Alpha-Triangle
/*
Sample Input 1:
3
Sample Output 1:
C
C B 
C B A
Sample Input 2 :
1
Sample Output 2 :
A
 */
public class h18 
{
    public static void alphaTriangle(int n) 
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        int count = n;
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=count;j--)
            {
                System.out.print(alphabet[j-1]+" ");
            }
            System.out.println();
            count--;
        }
    }    
    public static void main(String[] args)
    {
        alphaTriangle(3);
    }
}
