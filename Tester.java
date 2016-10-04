import java.io.*;
import java.util.*;
public class Tester
{
   public static void main(String[] args)
   {
       Scanner human = new Scanner(System.in);
       Car myWRX = new Car(28);
       System.out.print("Add how much gas to the tank? ");
       double gas = human.nextDouble();
       myWRX.fillUp(gas);
       myWRX.takeTrip(100);
       System.out.println(myWRX.reportFuel());
    }
}
