public abstract class Account
{   
    public int accountNumber = 0;
    public double balance = 0; 
    public double annualInterestRate = 0; 
    // Above i assign default values for the variables that represent the account number, the current balance, and the annual interest rate   

    // Constructor with account number and balance arguments
    public Account( int newAccountNumber, double newBalance, double interestRate ) 
    {
        accountNumber = newAccountNumber;   
        balance = newBalance;
        annualInterestRate = interestRate;  
    }

    // Accessor method for accountNumber    
    public int getAccountNumber() 
    {   
        return accountNumber;   
    }

    // Mutator method for accountNumber
    public void setAccountNumber( int newaccountNumber ) 
    {   
        accountNumber = newaccountNumber;   
    }
    
    // Accessor method for balance  
    public double getBalance() 
    {   
        return balance; 
    }

    // Mutator method for balance   
    public void setBalance( double newBalance ) 
    {   
        balance = newBalance;   
    }
    
    // Accessor method for annualInterestRate   
    public double getAnnualInterestRate()
    {   
        return annualInterestRate;  
    }
    
    // Mutator method for annualInterestRate
    public void setAnnualInterestRate( double newAnnualInterestRate ) 
    {   
        annualInterestRate = newAnnualInterestRate; 
    }
    
    // Accessor method for returning monthlyInterestRate
    public double getMonthlyInterestRate() 
    {
        return annualInterestRate/12;   
    }
    
    // Method for withdrawing specified amount
    public void withdraw( double withdrawAmount )
    {   
        balance -= withdrawAmount;  
    }
    
    // Method for depositing specified amount
    public void deposit( double depositAmount )
    {   
        balance += depositAmount;   
    }
}