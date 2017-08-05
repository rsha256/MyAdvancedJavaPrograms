package Unit6;/*
 * Created by rahul on 7/22/2017.
 * this is an 'L'
 */
import java.io.*;

public class ReadBinaryFileEx
{
    public static void main(String[] args)
    {
        int x = 0;
        double d = 0;
        char c = ' ';

        DataOutputStream out = null;

        try
        {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream( "products.dat" ) ) );

            DataInputStream in = new DataInputStream(
                 new BufferedInputStream(
                 new FileInputStream( "products.dat" ) ) );



            x = in.readInt( );
            d = in.readDouble( );
            c = in.readChar( );

            System.out.println( x + d + c );

            out.close();
        }
        catch ( IOException e )
        {
            System.out.println( "IO Exception thrown!" );
        }
    }
}
