package Unit9;

/*
 * Created by rahul on 7/29/2017.
 */
public class CountDown2
{
    public static void main(String[] args)
    {
        Thread threadOne = new Thread( new CountDownEven2() );
        Thread threadTwo = new Thread( new CountDownOdd2() );

        System.out.println();

        threadOne.start();
        threadTwo.start();
    }
}