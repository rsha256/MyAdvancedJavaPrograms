package Unit7;/*
 * Created by rahul on 7/24/2017.
 * This is perfect
 */
import Unit7.OfficeProduct;

import java.io.*;

public class WriteObjectDemo
{
    public static void main(String[] args)
    {
        OfficeProduct p1 = new OfficeProduct( 100, "Paper Clips", 1.10 );
        OfficeProduct p2 = new OfficeProduct( 102, "Staples    ", 2.95 );
        OfficeProduct p3 = new OfficeProduct( 103, "Rubber Bands", 1.00 );

        ObjectOutputStream out = null;

        try
        {
            out = new ObjectOutputStream(
                  new BufferedOutputStream(
                  new FileOutputStream( "objectfile.dat" )));

            out.writeObject( p1 );
            out.writeObject( p2 );
            out.writeObject( p3 );
            out.close();
        }
        catch ( IOException e )
        {
            System.out.println();
        }
    }
}
