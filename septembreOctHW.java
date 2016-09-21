import java.io.*;
import java.util.*;
public class septembreOctHW
{
   public static void main(String[] args)
   {
    try {
       int a, b, c;
       Scanner integer = new Scanner(System.in);
       System.out.print("Enter the first integer: ");
       a = integer.nextInt();
       System.out.print("Enter the second integer: ");
       b = integer.nextInt();
       System.out.print("Enter the third integer: ");
       c = integer.nextInt();
       if (a > b && a > c) //print a if it's the largest or smallest
       {
         System.out.println(a + " is the greatest");          
       }
       if (b > a && b > c) //likewise with b
       {
           System.out.println(b + " is the greatest");
       }
       if (c > a && c > b) //or c (though we can't determine which is the largest or smallest, just the extremes
       {
           System.out.println(c + " is the greatest");
       }
       if (a < b && a < c) //print a if it's the largest or smallest
       {
         System.out.println(a + " is the least");          
       }
       if (b < a && b < c) //likewise with b
       {
           System.out.println(b + " is the least");
       }
       if (c < a && c < b) //or c (though we can't determine which is the largest or smallest, just the extremes
       {
           System.out.println(c + " is the least");
       }
    }
    catch (Exception e) { //because I suspect something will make this crash
        System.out.println(e + ": we fucked up");
    }
   }
}
