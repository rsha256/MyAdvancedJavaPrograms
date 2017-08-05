package Unit8;

import Unit8.Customer;

import java.util.*;

public class QueueExercise
{
    public static void main( String [] args )
    {
        LinkedList<Customer> queue = new LinkedList< Customer >();
        char response = 'a';
        String name;
        int time = 0;
        Random rn = new Random( 20101119 ); // create a rn generator

        while ( response != 'q' )
        {
            name = Input.getString( "Enter a customer name" );
            time = rn.nextInt( 20 ) + 1;
            queue.addLast( new Customer( name, time ) );
            response = Input.getChar( "Enter 'a' to add a customer, 'q' to quit" );
        }
        System.out.println();
        for ( Customer c : queue )
            System.out.println( "Name is " + c.getName() +
                    " Service time is " + c.getTime() );
    }
}