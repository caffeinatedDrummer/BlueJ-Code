import java.io.*;
import java.util.*;
public class cinqIntAvg 
{
   public static void main(String[] args)
   {
       try {Scanner humanIn = new Scanner(System.in);
       System.out.println("Enter five integers: ");
       int a = humanIn.nextInt();
       int b = humanIn.nextInt();
       int c = humanIn.nextInt();
       int d = humanIn.nextInt();
       int e = humanIn.nextInt(); // I feel like this is bad code practice.
       double Average = (double)(a + b + c + d + e) / 5;
       System.out.println("The average of the 5 input integers is: " + Average);
    }
    catch (InputMismatchException e){
        System.out.println("I said INTEGERS, idiot! And don't make them too big!"); //because doubles cause it to crash
   }
}
}