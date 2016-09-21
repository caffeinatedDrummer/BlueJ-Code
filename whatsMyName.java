import java.io.*;
import java.util.*;
public class whatsMyName //, whitman?
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String fn = kbReader.next();
        System.out.println("What is your last name? ");
        String ln = kbReader.next();
        System.out.println("Hello, " + fn + " " + ln + "!"); //do I really need to explain what this does?
    }
}
