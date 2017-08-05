import java.util.Scanner;

public class AccountDriver
{
    public static void main(String args[])
    {
        int accID = 0;
        double balance = 0;
        double intRate = 0;
        double withDraw = 0;
        double Deposit = 0;
        String monthName;
        int dayNumber;
        int yearNumber;        
        // Above are the variables that store the user input.
        
        Scanner in = new Scanner(System.in);
        // Above I created a new Scanner object which I can reference throughout the program for user input using 'in'. 
        
        // Below I get the Account Number for the Savings bank Account
        System.out.println( "Enter the Account Number for the Savings Account :" );
        accID = in.nextInt();
        in.nextLine();
        
        // Below I get the Initial Balance for the Savings bank Account
        System.out.println( "Enter the Initial balance of Savings Account :" );
        balance = in.nextDouble(); 
        in.nextLine();
        
        // Below I get the Interest rate for the Savings bank Account        
        System.out.println( "Enter the Rate of Interest for savings:" );
        intRate= in.nextDouble(); 
        in.nextLine();
        
        // Below I create a SavingsAccount object
        SavingsAccount sb = new SavingsAccount(accID, balance, intRate);
        
        // Below I get the amount that the user wants deposited
        System.out.println( "Enter an amount you want to be deposited into savings account? " );
        Deposit = in.nextDouble(); 
        sb.deposit( Deposit );

        // Below I get the amount that the user wants withdrawn        
        System.out.println( "Enter an amount you want to withdraw From savings account? " );
        withDraw = in.nextDouble(); 
        sb.withdraw( withDraw );
        
        // Below I get the amount that the user wants deposited
        System.out.println( "Enter an amount you want to be deposited into savings account? " );
        Deposit = in.nextDouble(); 
        sb.deposit( Deposit );
        
        // Below I get the amount that the user wants withdrawn        
        System.out.println( "Enter an amount you want to withdraw From savings account? " );
        withDraw = in.nextDouble(); 
        sb.withdraw( withDraw );
        
        // Below I get the user to input the date's month with a prompting statement
        System.out.print( "Enter the Date of this transaction: \nMonth: " );
        // the input is then stored to a variable with the previously defined Scanner object
        monthName = in.next();
        
        // Below I get the user to input the date's day with a prompting statement
        System.out.print( "\nDay: " );
        // the input is then stored to a variable with the previously defined Scanner object
        dayNumber = in.nextInt();
        
        // Below I get the user to input the date's year with a prompting statement
        System.out.print( "\nYear: " );
        // the input is then stored to a variable with the previously defined Scanner object        
        yearNumber = in.nextInt();
        
        // Below I use the user input (gotten above) in an object of the LongDate class
        LongDate dc = new LongDate( monthName, dayNumber, yearNumber );
        
        // Below I display all the data attributes for sll the objects (including the date)
        System.out.println( "\nSavings Account Status: " + "\nDate of the Account Creation: " + dc + "\n" + sb );

        
        // Below I create 2 line breaks to indicate that you are now dealing with the checking account
        System.out.println( "\n" );
        
        
        // Below I get the Account Number for the Checking bank Account
        System.out.println( "Enter the Account Number for the Checking Account :" );
        accID = in.nextInt();
        in.nextLine();
        
        // Below I get the Initial Balance for the Checking bank Account
        System.out.println( "Enter the Initial balance of Checking Account :" );
        balance = in.nextDouble(); 
        in.nextLine();
        
        // Below I get the Interest rate for the Checking bank Account        
        System.out.println( "Enter the Rate of Interest for the Checking Account: " );
        intRate= in.nextDouble(); 
        in.nextLine();
        
        // Below I create a CheckingAccount object
        CheckingAccount chk = new CheckingAccount( accID, balance, intRate );
        
        // Below I get the amount that the user wants deposited
        System.out.println( "Enter an amount you want to be deposited in Checking account? " );
        Deposit = in.nextDouble(); 
        chk.deposit(Deposit);
        
        // Below I get the amount that the user wants withdrawn        
        System.out.println( "Enter an amount you want to withdraw From Checking account? " );
        withDraw = in.nextDouble(); 
        chk.withdraw(withDraw);
        
        // Below I get the amount that the user wants deposited
        System.out.println( "Enter an amount you want to be deposited in Checking account? " );
        Deposit = in.nextDouble(); 
        chk.deposit(Deposit);
        
        // Below I get the amount that the user wants withdrawn                
        System.out.println( "Enter an amount you want to withdraw From Checking account? " );
        withDraw = in.nextDouble(); 
        chk.withdraw(withDraw);
        
        // Below I get the user to input the date's month with a prompting statement        
        System.out.print( "Enter the Date of this transaction: \nMonth: " );
        // the input is then stored to a variable with the previously defined Scanner object        
        monthName = in.next();
        
        // Below I get the user to input the date's day with a prompting statement        
        System.out.print( "\nDay: " );
        // the input is then stored to a variable with the previously defined Scanner object        
        dayNumber = in.nextInt();
        
        // Below I get the user to input the date's year with a prompting statement        
        System.out.print( "\nYear: " );
        // the input is then stored to a variable with the previously defined Scanner object        
        yearNumber = in.nextInt();
        
        // Below I use the user input (gotten above) in an object of the LongDate class        
        LongDate dc2 = new LongDate( monthName, dayNumber, yearNumber );
        
        // Below I display all the data attributes for sll the objects (including the date)        
        System.out.println( "\nChecking Account Status: " + "\nDate of the Account Creation: " + dc2 + "\n" + chk );
    }  
}