import java.io.*;
import java.util.*;
public class septembreSeptHW
{
   public static void main(String[] args)
   {
       try {
       int sum;
       Scanner integer = new Scanner(System.in);
       System.out.print("Enter the first integer: ");
       sum = integer.nextInt();
       System.out.print("Enter the second integer: ");
       sum += integer.nextInt();
       System.out.print("Enter the third integer: ");
       sum += integer.nextInt();
       System.out.println("The sum of the above integers is: " + sum);
    }
    catch (InputMismatchException e) {
        System.out.println("INTEGERS, dummy! Or a smaller integer!");
    }
   }
}
