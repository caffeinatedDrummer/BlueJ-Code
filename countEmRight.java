import java.io.*;
import java.util.*;
public class countEmRight
{
    public static void main(String[] args)
    {
        Scanner human = new Scanner(System.in);
        String tester = "";
        while (!tester.equals("EXIT"))
        {
            System.out.print("Type a sentence, then press ENTER: ");
            tester = human.nextLine().toUpperCase();
            if (tester.equals("EXIT"))
            continue;
            tester = tester.concat("KI");
            String sp[] = tester.split("S\\s+A|SA");
            System.out.println("There are "+(sp.length - 1)+" occurrances.");
            
        }
    }
}
