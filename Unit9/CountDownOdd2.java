package Unit9;

/*
 * Created by rahul on 7/29/2017.
 */
public class CountDownOdd2 implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        for ( int i = 9; i > 0; i -= 2 )
        {
            System.out.println( t.getName() + " Count is " + i );
            Thread.yield();
        }
    }
}