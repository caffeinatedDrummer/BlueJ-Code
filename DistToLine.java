
public class DistToLine {
	public static double A;
	public static double B;
	public static double C;
	public static double getDist(double x , double y)
	{
		double distance = Math.abs(A*x + B*y + C) / Math.sqrt(A*A + B*B);
		return distance;
	}
}
