public class CheckingAccount extends Account
{
    final double OVER_DRAFT = -1000; 
    // Above is the constant that represents the overdraft amount
    
    public CheckingAccount( int newaccountNumber, double newBalance, double interestRate )
    {
        super(newaccountNumber, newBalance, interestRate);
    }
    
    // Below is the withdraw method which takes a double variable in (to account for cents) and determines if the withdrawal can be made. If it can, it is done here
    public void withdraw( double withdrawAmount )
    {      
        if ( balance - withdrawAmount < 0 ) 
        {
            System.out.println( "Insufficent funds" );
            
            if ( balance - withdrawAmount <= OVER_DRAFT ) 
            {
                System.out.println( "You have exceeded your Overdraft Limit. Your attempt to withdraw as been cancelled" );
            }
            else
            {
                System.out.println( "However since you are less than 1000 dollars in debt we are charging this onto your overdraft limit" );
                balance -= withdrawAmount;
                // if exceeding - but only by less than 1000 the withdrawl can be made
            }
        }
            else 
            { 
                // if not exceeding bank balance, withdraw as usual
                balance -= withdrawAmount;
            }
        
    }
    
    // Below is the toString method which returns all the Checking Account info
    public String toString()
    {
        return "Account accountNumber: " + accountNumber + "\nBalance: " + balance + "\nAnnual Interest rate: " + annualInterestRate; 
    }
}