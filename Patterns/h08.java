public class h08 
{
	public static void nStarTriangle(int n) 
	{
		int space=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=(2*(i)-1);j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space++;
		}
    }
	public static void main(String[] args)
	{
		nStarTriangle(3);
	}
}