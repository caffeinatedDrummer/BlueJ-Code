import java.io.*;
import java.util.*;

// I LIKE Steins;Gate, okay?!?
public class drPepper
{
   public static void main(String[] args)
   {
       Scanner survey = new Scanner(System.in);
       System.out.println("Do you like Dr. Pepper?");
       String ans = survey.nextLine();
       if (ans.contains("y"))
       {
           System.out.println("The drink of scientists everywhere!");
       }
       else if (ans.contains("n"))
       {
           System.out.println("Heretic!");           
        }
       else
       {
           System.out.println("What? Try again.");
        }
       
   }
}
