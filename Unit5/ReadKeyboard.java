package Unit5;

import java.io.*;
import java.util.*;

/**
 * Created by rahul on 7/16/2017.
 */
public class ReadKeyboard
{
    public static void main(String[] args)
    {
        Scanner keyboard = null;
        try
        {
            keyboard = new Scanner( System.in );

            System.out.println();
            System.out.println( "Enter an integer: " );
            long anInteger = keyboard.nextLong();
            System.out.println( "Enter a boolean: " );
            boolean aBoolean = keyboard.nextBoolean();
            System.out.println( "You entered: " + anInteger + " " + aBoolean );
            System.out.println();
        }
        catch ( InputMismatchException e )
        {
            System.out.println( "InputMismatchException" );
        }
    }
}
