package Unit9;

/*
 * Created by rahul on 7/29/2017.
 */
public class CountDown
{
    public static void main(String[] args)
    {
        Thread threadOne = new CountDownEven();
        Thread threadTwo = new CountDownOdd();

        System.out.println();

        threadOne.start();
        threadTwo.start();
    }
}
