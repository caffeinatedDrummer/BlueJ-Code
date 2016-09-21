public class /* going 0 - 50 */ realQuick 
{
    public static void main(String[] args)
    {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < 51; i+=2)
        {
            sumEven += i;
        }
        for (int x = 1; x < 51; x+=2)
        {
            sumOdd += x;
        }
        System.out.println("The sum of all even numbers is " + sumEven);
        System.out.println("The sum of all odd numbers is " + sumOdd);
    }
}