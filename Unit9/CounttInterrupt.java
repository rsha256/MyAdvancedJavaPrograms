package Unit9;/*
 * Created by rahul on 7/29/2017.
 */
import Unit9.Counter;

import java.util.Scanner;

public class CounttInterrupt
{
    public static void main(String[] args)
    {
        Thread counter = new Counter();
        System.out.println();
        counter.start();

        Scanner aScanner = new Scanner( System.in );
        String s = "";

        while ( !s.equals( "stop" ) )
            s = aScanner.next();
        counter.interrupt();
    }
}
