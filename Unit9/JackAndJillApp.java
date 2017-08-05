package Unit9;/*
 * Created by rahul on 7/30/2017.
 */

import Unit9.JackAndJill;

public class JackAndJillApp
{
    public static void main(String[] args)
    {
        JackAndJill theAccount = new JackAndJill();

        Thread one = new Thread( theAccount, "Jack" );
        Thread two = new Thread( theAccount, "Jill" );

        one.start();
        two.start();
    }
}
