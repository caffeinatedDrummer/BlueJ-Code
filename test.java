import java.io.*;
import java.util.*;
public class test
{
    public static void main(String[] args)
    {
        Scanner human = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = human.next();
        switch(month.toLowerCase()) { //running toLowerCase in case people enter the months awkwardly
            case "january": case "march": case "may": case "july": case "august": case "october": case "december":
            System.out.println(month + " has 31 days.");
            break;
            case "april": case "june": case "september": case "november":
            System.out.println(month + " has 30 days.");
            break;
            case "february":
            System.out.println("February of what year?");
            int year = human.nextInt();
            if (year%4 == 0 && !(year % 100 == 0 && year % 400 != 0)){
                System.out.println("Leap year! "+month+" "+year+" has 29 days.");
            }
            else{
                System.out.println(month + " " + year + " has 28 days.");
            }
    }
}
}