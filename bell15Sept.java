import java.io.*;
import java.util.*;
public class bell15Sept
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = console.next();
        switch (month.toLowerCase())
        {
            case "jan": case "january": case "march": case "mar": case "may": case "jul": case "july": case "aug": case "august": case "oct": case "october": case "dec": case "december":
            System.out.println(month + " has 31 days.");
            break;
            case "apr": case "april": case "jun": case "june": case "sept": case "september": case "nov": case "november":
            System.out.println(month + " has 30 days.");
            break;
            case "feb": case "february":
            System.out.println(month + " has either 28 or 29 days depending on leap-year status.");
            break;
            default:
            System.out.println("That's not a month, bro.");
        }
    }
}