import java.io.*;
import java.util.*;
public class gradeSwitch
{
   public static void main(String[] args)
   {
       Scanner human = new Scanner(System.in);
       System.out.println("Enter your grade percentage: ");
       int grade = human.nextInt();
       switch (grade) {
           case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
               System.out.println("You got an A! Woo!");
               break;
           case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
               System.out.println("You got a B!");
               break;
           case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
               System.out.println("You got a C!");
               break;
           case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
               System.out.println("You got a D.");
               break;
           default:
               System.out.println("You failed. No shame in asking for help!");
       }
   }
}
//oh god it's so ugly