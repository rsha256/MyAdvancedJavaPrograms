package Unit8;/*
 * Created by rahul on 7/26/2017.
 */
import java.util.*;

public class UsingLinkedList2
{
    public static void main(String[] args)
    {
        LinkedList<String> someQuotes = new LinkedList<String>();

        // 1
        someQuotes.add( "A stitch in time saves nine." );
        // x
        someQuotes.addFirst( "A penny saved is a penny earned." );
        // x
        someQuotes.addLast( "Today is the first day of the rest of your life." );
        // 0
        someQuotes.set( 0, "Dogs eat. Cats dine." );
        someQuotes.removeLast();

        String first = someQuotes.getFirst();

        System.out.println();
        for ( String s : someQuotes )
            System.out.println( s );
        System.out.println();
    }
}
