/*
Number Crown
2*(n+1)-(2*(i-1))
1         1 => 8  => 8 -2*(0) => 8-0 => 8
1 2     2 1 => 4  => 8 - 2 => 6
1 2 3 3 2 1 => 0 

 */
public class h12 
{
    public static void numberCrown(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
            int spaces = *(n-1);
            System.out.println(spaces);  
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");  
            }
            
            for (int j = i; j >= 1; j--) 
            {
                System.out.print(j + " ");
            }
            System.out.println();  

        }
                        
    }    
    public static void main(String[] args)
    {
        numberCrown(3);
    }
}
