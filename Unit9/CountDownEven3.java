package Unit9;

public class CountDownEven3 extends Thread
{
	public void run()
	{
		for( int i = 10; i > 0; i -= 2 )
		{
			System.out.println( this.getName() + " Count is " + i );
			try
			{
				Thread.sleep( 400 );
			}
			catch ( InterruptedException e ) {}
		}
	}
}