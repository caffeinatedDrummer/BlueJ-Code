
/**
 * Write a description of class mixedResults here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//playing with mixed variable types
public class mixedResults
{
    static double d1 = 37.9;
    static double d2 = 1004.128;
    static int i1 = 12;
    static int i2 = 18;
    static int count = 1;
    public static void main(String[] args)
    {
        System.out.println("Problem 1: " + (57.2 * (i1 / i2) + 1));
        System.out.println("Problem 2: " + (57.2 * ( (double)i1 / i2) +1));
        System.out.println("Problem 3: " + (15 - i1 * (d1 * 3) + 4));
        System.out.println("Problem 4: " + (15 - i1 * (int)(d1 * 3) + 4));
        System.out.println("Problem 5: " + (15 - i1 * ( (int)d1 * 3) +4));
    }
}
