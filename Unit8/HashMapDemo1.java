package Unit8;/*
 * Created by rahul on 7/27/2017.
 */
import java.util.*;

public class HashMapDemo1
{
    public static void main( String [] args )
    {
        HashMap< Integer, String > products = new HashMap< Integer, String >();

        products.put( 102, "Staples" );
        products.put( 100, "Paper Clips" );
        products.put( 103, "Rubber Bands" );

        System.out.println();

        for ( Map.Entry product : products.entrySet() )
            System.out.println( product.getKey() + " : " + product.getValue() );

        System.out.println( "\n\nProduct for code 100 is " + products.get( 100 ) );
    }
}
