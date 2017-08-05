package Unit8;/*
 * Created by rahul on 7/27/2017.
 */
import Unit7.OfficeProduct;

import java.util.*;

public class TreeMapDemo2
{
    public static void main( String [] args )
    {
        TreeMap< Integer, OfficeProduct > products = new TreeMap< Integer, OfficeProduct >();

        OfficeProduct p1 = new OfficeProduct( 102, "Staples    ", 2.95 );
        OfficeProduct p2 = new OfficeProduct( 100, "Paper Clips", 1.10 );
        OfficeProduct p3 = new OfficeProduct( 103, "Rubber Bands", 1.00 );

        products.put( p1.getProductCode(), p1 );
        products.put( p2.getProductCode(), p2 );
        products.put( p3.getProductCode(), p3 );

        System.out.println();

        for ( Map.Entry product : products.entrySet() )
        {
            OfficeProduct p = products.get( product.getKey() );
            System.out.println( p.getProductCode() + " : " + p.getProductDescription() + " : " + p.getProductPrice() );
        }
    }
}