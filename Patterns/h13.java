/*
13: Increasing Number Triangle

1
2 3
4 5 6 

1
2 3
4 5 6
7 8 9 10 

1
2 3
4 5 6 
7 8 9 10
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28  
 */
public class h13 
{
    public static void nNumberTriangle(int n) 
    {
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)    
    {
        nNumberTriangle(7);    
    }
}
