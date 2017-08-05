package Unit9;/*
 * Created by rahul on 7/29/2017.
 */

public class CountDown3
{
    public static void main(String[] args)
    {
        Thread threadOne = new CountDownEven3();
        Thread threadTwo = new CountDownOdd3();

        threadOne.setPriority( Thread.MIN_PRIORITY );
        threadTwo.setPriority( Thread.MAX_PRIORITY );

        System.out.println();

        threadOne.start();
        threadTwo.start();
    }
}