class CatchExceptions6
{
    // Below I initialized a variable called result which is static so that the methods divide and main can access it but private so that only these class members can access it
    private static int result = 0;

    public static void main( String [] args )
    {
        // Below I print out a linefeed for neatness
        System.out.println();

	// Below is a try block which works in connection with the catch block below if a DivideByZeroException exception occurs. Otherwise it justs continues at the end of the catch block
        try
        {
            divide( 10, 0 );
        }
        // If a DivideByZeroException exception occurs in the try block above, i catch it below
        catch ( DivideByZeroException e )
        {
            // Below are the variables count and maxTries which are used below. You can change 'maxTries' to determine the number of tries the user is given
            int count = 0;
            int maxTries = 5;

            // For this program to give repeated tries i set the condition as true so it runs forever (until a break statement)
            while (true)
            {
		// Since this in a while loop the try block below will go on forever until a break statement
                try
                {
		    // Below I use the Input class to get user input which is stored to the variable 'n'
                    int n = Input.getInt( "Denominator must be nonzero...enter again" );
		    // Below I print 10 and a obelus and the inputted int to indicate to the user what they inputted
		    System.out.print( "10 ÷ " + n + " " );
		    // Below I call the divide method with the parameters of 10 (from before) along with 'n' (the user's re-inputted denominator)
                    divide( 10, n );
		    // Below I print what the result is (for when it finally prints)
                    System.out.println( "= " + result );
		    // Below is a break statement to exit out of the loop (and program). This will not be executed unless there's no error as divide is called before this statement
                    break;
                }
                catch ( DivideByZeroException ex )
                {
		    // Below i print a statement that tells the user they inputted 0 as the denominator
                    System.out.println( "\nTry again, you cannot divide by 0!" );
		    // Below I have an if-statement that stops the program after 'maxTries' times. If you delete the statement below, the program won't stop until a nonzero int is inputted
		    if (++count == maxTries)
                    {
                        System.out.println( "Sorry you have your chance!" );
                        break;
                    }
                }
            }
        }
    }

    // Below is the unchanged divide method
    public static int divide( int x, int y ) throws DivideByZeroException
    {
        try
        {
            result = x / y;
        }
        catch ( ArithmeticException e )
        {
            throw new DivideByZeroException( y );
        }
        return result;
    }
}