package Unit8;/*
 * Created by rahul on 7/26/2017.
 */
import java.util.*;

public class UsingArrayList2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> someNums = new ArrayList<Integer>();

        someNums.add( 32 );
        someNums.add( 110 );

        someNums.clear();

        System.out.println();

        if ( someNums.isEmpty() )
            System.out.println( "ArrayList is empty" );
        else
            for ( int i = 0; i < someNums.size(); i++ )
                System.out.println( someNums.get( i ) );

        System.out.println();
    }
}