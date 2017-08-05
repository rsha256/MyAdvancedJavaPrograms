package Unit8;/*
 * Created by rahul on 7/26/2017.
 */
import java.util.*;

public class UsingArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<String> someQuotes = new ArrayList<String>();

        someQuotes.add( "A stitch in time saves nine." );
        someQuotes.add( "A penny saved is a penny earned." );

        someQuotes.add( 0, "Got Java?" );

        someQuotes.add( "Today is the first day of the rest of your life!" );

        someQuotes.set( 0, "Dogs eat. Cats dine." );

        someQuotes.remove( 3 );

        System.out.println();
        for ( int i = 0; i < someQuotes.size(); i++ )
            System.out.println( someQuotes.get( i ) );
        System.out.println();
    }
}
