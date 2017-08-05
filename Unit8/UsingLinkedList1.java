package Unit8;/*
 * Created by rahul on 7/26/2017.
 */
import java.util.*;

public class UsingLinkedList1
{
    public static void main( String [] args )
    {
        LinkedList<String> someQuotes = new LinkedList<String>();

        // 2
        someQuotes.add( "A stitch in time saves nine." );
        // 1
        someQuotes.addFirst( "A penny saved is a penny earned." );

        // x
        someQuotes.add( 0, "Got Java?" );

        // x
        someQuotes.addLast( "Today is the first day of the rest of your life!" );

        // 0
        someQuotes.set( 0, "Dogs eat. Cats dine." );

        someQuotes.removeLast();

        System.out.println();
        for ( int i = 0; i < someQuotes.size(); i++ )
            System.out.println( someQuotes.get( i ) );
        System.out.println();
    }
}