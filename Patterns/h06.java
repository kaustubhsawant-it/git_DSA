public class h06 
{
    public static void nNumberTriangle(int n) 
    {
        for(int x=n;x>=1;x--)    
        {
            int k=1;
            for(int y=1;y<=x;y++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
	public static void main(String[] args)
	{
		nNumberTriangle(5);
	
	}
}