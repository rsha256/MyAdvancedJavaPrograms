package Unit11;

// This is the Loan class which calculates the Loan based on the info(interest, years, amount) passed to it
public class Loan
{
    // Below are variables that hold information about the loan which is used to calculate the loan!
    private double yearlyInterestRate;
    private int numberOfYears;
    private double loanAmount;

    // Construct a loan with specified annual interest rate, number of years, and loan amount
    Loan( double annualInterestRate, int numberOfYears, double loanAmount )
    {
        // When a Loan object is created the setter methods are automatically invoked (below)
        setAnnualInterestRate( annualInterestRate );
        setNumberOfYears( numberOfYears );
        setLoanAmount( loanAmount );
    }

    // Getter method for yearlyInterestRate
    private double getAnnualInterestRate()
    {
        return yearlyInterestRate;
    }

    // Setter method for a new annualInterestRate
    private void setAnnualInterestRate( double annualInterestRate )
    {
        this.yearlyInterestRate = annualInterestRate;
    }

    // Getter method for numberOfYears
    private int getNumberOfYears()
    {
        return numberOfYears;
    }

    // Setter method for a new numberOfYears
    private void setNumberOfYears( int numberOfYears )
    {
        this.numberOfYears = numberOfYears;
    }

    // Getter method for loanAmount
    private double getLoanAmount()
    {
        return loanAmount;
    }

    // Setter method for a new loanAmount
    private void setLoanAmount( double loanAmount )
    {
        this.loanAmount = loanAmount;
    }

    // Find monthly payment
    double getMonthlyPayment()
    {
        // Below i divide by 1200 instead of 12 to account for the user inputting as a percent and not as a decimal
        double monthlyInterestRate = getAnnualInterestRate() / 1200;
        // BBelow i return the monthly payment by using the formula: (interest * loanAmount)/(1 - (1 + interest)^-n)
        return ( monthlyInterestRate * getLoanAmount() ) / ( 1 - ( 1 / Math.pow( 1 + monthlyInterestRate, getNumberOfYears() * 12 ) ) );
    }

    // Find total payment
    double getTotalPayment()
    {
        // I do this by multiplying the monthly payment by the number of years by 12
        return getMonthlyPayment() * getNumberOfYears() * 12;
    }
}