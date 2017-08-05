public class SavingsAccount extends Account
{
    // Below is the class constructor, which takes 3 parameters (newaccountNumber, newBalance, interestRate)
    public SavingsAccount( int newaccountNumber, double newBalance, double interestRate )
    {
        super( newaccountNumber, newBalance, interestRate );
    }
    
    public void withdraw( double withdrawAmount ) // double argument
    {   
        if ( balance - withdrawAmount < 0 )
        {
            System.out.println( "Insufficient funds to withdraw! Since this is a savings account, your account cannot be overdrawn and this attempt will be ignored." );   
            // Since this is a savings account, the account cannot be overdrawn.
        }
        else
        {
            balance -= withdrawAmount;
            // However if they are not withdrawing too much they can still withdraw, with the above statement
        }
    }
    
    // Below is the toString method which returns all the SavingsAccount info
    public String toString()
    {
        return "Account accountNumber: " + accountNumber + "\nBalance: " + balance + "\nAnnual Interest rate: " + annualInterestRate;
    }
}