public class h07 
{
	public static void nStarTriangle(int n) 
	{
		for(int x=1;x<=n;x++)
		{
			for(int k=n-1;k>=x;k--)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=(2*x-1);y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
    	}
	public static void main(String[] args)
	{
		nStarTriangle(3);
	}	
}