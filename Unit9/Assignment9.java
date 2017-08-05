package Unit9;

import java.util.Random;

public class Assignment9
{
    public static void main( String [] args )
    {
        // Below I instantiate the Random class and name the created object 'r'
        Random r = new Random();
        // Below I use the object of the Random class to call the nextInt method from the Random class
        // This will randomly generate a number from 0 to 1000 and store that number to the integer variable 'num'
        int num = r.nextInt( 1001 );

        // Below I instantiate a Thread that will search from 0 to 349 searching for 'num'
        Thread threadOne = new FindIt( num, 0, 349 );
        // Below I instantiate a Thread that will search from 350 to 699 searching for 'num'
        Thread threadTwo = new FindIt( num, 350, 699 );
        // Below I instantiate a Thread that will search from 700 to 1000 searching for 'num'
        Thread threadThree = new FindIt( num, 700, 1000 );

        // Below I start the first thread
        threadOne.start();
        // Below I start the second thread
        threadTwo.start();
        // Below I start the third thread
        threadThree.start();
    }
}