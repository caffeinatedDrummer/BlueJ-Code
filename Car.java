public class Car
{
    public int mileage;
    public double gas;
    public Car(int mpg)
    {
        mileage = mpg;
        gas = 0;
    }
    public void fillUp(double x)
    {
        gas = x;
    }
    public void takeTrip(int distance)
    {
        gas -= (double)distance / (double)mileage;
    }
    public double reportFuel()
    {
        return gas;
    }
    
}
