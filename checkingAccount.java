public class checkingAccount
{
    // instance variables
    public int bal;
    public String holder;
    public String accNum;
    public checkingAccount(String name, String newNum, int initBal)
    {
        // initialise instance variables
        holder = name;
        bal = initBal;
        accNum = newNum;
    }
    public void makeDeposit(int amount)
    {bal += amount;}
    public void makeWithdrawl(int amount)
    {bal -= amount;}
    
}
