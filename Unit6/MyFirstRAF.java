package Unit6;/*
 * Created by rahul on 7/22/2017.
 */

import java.io.RandomAccessFile;

public class MyFirstRAF
{
    public static void main(String[] args)
    {
        int productCodes[] = { 100, 102, 103 };
        double productPrices[] = { 1.10, 2.95, 1.00};
        RandomAccessFile f = null;

        try
        {
            f = new RandomAccessFile( "product.dat", "rw" );

            for ( int i = 0; i < 3; i++ )
            {
                f.writeInt( productCodes[ i ] );
                f.writeDouble( productPrices[ i ] );
            }

            System.out.println( "\n" + f.length() + " bytes written to file\n" );

            f.close();
        }

        catch ( Exception e )
        {
            System.out.println( "Exception thrown!" );
        }
    }
}
