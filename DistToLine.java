
public class DistToLine {
	public static double A;
	public static double B;
	public static double C;
	public static double getDist(double x , double y)
	{
		return Math.abs(A*x + B*y + C) / Math.sqrt(A*A + B*B); //for maximum efficiency we just do the math and return it on the same line
	}														   //(no variable declaration required)
}
