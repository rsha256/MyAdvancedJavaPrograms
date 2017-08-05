package Unit9;

/*
 * Created by rahul on 7/29/2017.
 */
public class BankAccount
{
    public int balance = 60;

    public synchronized void withdraw( int withdrawAmount )
    {
        balance -= withdrawAmount;
    }

    public int getBalance()
    {
        return balance;
    }
}