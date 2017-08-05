package Unit7;/*
 * Created by rahul on 7/24/2017.
 *
 */
import Unit7.OfficeProduct;

import java.io.*;

public class ReadObjectDemo
{
    public static void main(String[] args)
    {
        ObjectInputStream in = null;

        try
        {
            in = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream( "objectfile.dat" ) ) );

            for ( int i = 0; i < 3; i++ )
            {
                OfficeProduct p = (OfficeProduct) in.readObject();
                display( p );
            }
            in.close();
        }

        catch ( Exception e )
        {
            System.out.println( "Exception Thrown!" );
        }
    }

    public static void display( OfficeProduct p )
    {
        System.out.println( "\n" + p.getProductCode()
                + "\t" + p.getProductDescription()
        + "\t" + p.getProductPrice() );
    }

}
