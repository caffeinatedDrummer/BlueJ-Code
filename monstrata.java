//thank mr monstrata for dank triangles

public class monstrata 
{
    public static void main(String[] args)
    {
        
        for (int i = 0; i < 10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int k = 0; k < 10; k++)
        {
            for (int l = 1; l <= k; l++)
            {
                System.out.print("* ");
            }
            System.out.println(); //yes we need a blank line at the end
        }
        
        for (int m = 9; m > 0; m--)
        {
            for (int j = m; j < 9; j++)
            {
                System.out.print("- ");
            }
            for (int o = m; o > 0; o--)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
//how the actual f**k did I get this to work 

