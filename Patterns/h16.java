//16:  Alpha-Ramp
/*
Sample Input 1:
3
Sample Output 1:
A
B B
C C C
Sample Input 2 :
1
Sample Output 2 :
A
Sample Input 3 :
4
Sample Output 3 :
A
B B
C C C
D D D D

 */
public class h16 
{
    public static void alphaRamp(int n) 
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(alphabet[count]+" ");
            }
            count++;
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        alphaRamp(3);
    }
}