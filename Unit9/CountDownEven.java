package Unit9;

/*
 * Created by rahul on 7/29/2017.
 */
public class CountDownEven extends Thread
{
    public void run()
    {
        for ( int i = 10; i > 0; i -= 2 )
        {
            System.out.println( this.getName() + " Count is " + i );
            Thread.yield();
        }
    }
}
