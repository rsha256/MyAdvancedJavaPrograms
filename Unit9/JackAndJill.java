package Unit9;/*
 * Created by rahul on 7/29/2017.
 */

import Unit9.BankAccount;

public class JackAndJill implements Runnable
{
    private BankAccount jointAccount = new BankAccount();

    public void run()
    {
        for ( int i = 0; i < 5; i++ )
        {
            System.out.println("i = " + i);
            makeWithdrawal( 20 );

            if ( jointAccount.getBalance() < 0 )
                System.out.println("Account Overdrawn!");
        }
    }

    private void makeWithdrawal( int amount )
    {
        if (jointAccount.getBalance() >= amount)
        {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw!");
            try
            {
                System.out.println(Thread.currentThread().getName() + " is about to sleep!");
                Thread.sleep( 500 );
            }
            catch ( InterruptedException e )
            {
            }

            System.out.println(Thread.currentThread().getName() + " woke up!");
            jointAccount.withdraw( amount );
            System.out.println(Thread.currentThread().getName() + " completed the withdrawal!");
        }
        else
        {
            System.out.println( "Sorry...not enough bucks for " + Thread.currentThread().getName() );
        }
    }
}