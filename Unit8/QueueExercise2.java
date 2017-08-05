package Unit8;

import Unit8.Customer;
import Unit8.FIFOQueue;

import java.util.*;

public class QueueExercise2
{
    public static void main( String [] args )
    {
        FIFOQueue<Customer> queue = new FIFOQueue< Customer >();
        char response = 'a';
        String name;
        int time;

        Random rn = new Random();

        while ( response != 'q' )
        {
            name = Input.getString( "Enter a customer name" );
            time = rn.nextInt( 20 ) + 1;
            queue.add( new Customer( name, time ) );
            response = Input.getChar( "Enter 'a' to add a customer, 'q' to quit" );
        }

        System.out.println();
        while ( queue.size() > 0 )
        {
            Customer c = queue.get();
            System.out.println( "Name is " + c.getName() +
                    " Service time is " + c.getTime() );
        }
    }
}