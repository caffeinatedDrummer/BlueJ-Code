import java.io.*;
import java.util.*;
public class grades
{
   public static void main(String[] args)
   {
       Scanner human = new Scanner(System.in);
       System.out.println("Enter your grade percentage: ");
       int grade = human.nextInt();
       if (grade > 100) {System.out.println("Extra credit HYYYPE!");}
       else if (grade >= 90) {System.out.println("You got an A! Woo!");}
       else if (grade >= 80 && grade <= 89) {System.out.println("You got a B! Great job!");}
       else if (grade >= 70 && grade <= 79) {System.out.println("You got a C, keep on keepin' on!");}
       else if (grade >= 60 && grade <= 69) {System.out.println("You got a D, need some help?");}
       else if (grade <= 59) {System.out.println("You failed ;-; There's no shame in asking for help!");}
       else {System.out.println("Wait, what?");}
   }
}
