
//we don't need java.io anymore!!!
import java.util.*;
public class humanIn {
	public static void main(String args[])
	{
		Scanner human = new Scanner(System.in); //construct a scanner so we can take terminal input
		
		System.out.println("Enter the A value: ");
		DistToLine.A = human.nextDouble();
		System.out.println("Enter the B value: ");
		DistToLine.B = human.nextDouble();
		System.out.println("Enter the C value: ");
		DistToLine.C = human.nextDouble();			//take input from the user and write to the class's variables (no object creation required!)
		
		System.out.println("Enter the X value: "); //these X and Y values are local to the class
		double x = human.nextDouble();
		System.out.println("Enter the Y value: ");
		double y = human.nextDouble();
		
		System.out.println("Distance from the point to the line is: " + DistToLine.getDist(x, y)); //print the result (you can save to a variable if you really want to for some reason)
		
	}
	
}
