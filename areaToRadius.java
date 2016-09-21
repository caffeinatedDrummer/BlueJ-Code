import java.io.*;
import java.util.*;
public class areaToRadius
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in); //construct a Scanner
        System.out.println("What is the area? ");
        double area = kbReader.nextDouble(); //take in the next thing the user enters...
        double rad = Math.sqrt(area / Math.PI); //and compute the radius.
        System.out.println("Radius of your circle is: " + rad); //then print it!
        
    }
}
