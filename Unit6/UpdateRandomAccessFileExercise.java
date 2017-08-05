package Unit6;

import java.io.*;

public class UpdateRandomAccessFileExercise
{
    public static void main(String[] args)
    {
        int x = 48;

        try
        {
            RandomAccessFile in = null;
            in = new RandomAccessFile( "products.dat", "rws" );

            in.seek( 126 ); // position to where quantity is stored
            in.writeInt( 48 ); // update quantity
            in.seek( in.length() ); // position pointer to end of file
            // add new record
            in.writeInt( 100 );
            in.writeChars( "Roofing Tacks " );
            in.writeInt( 1500 );
            in.writeDouble( 7.95 );
            in.close();
        }
        catch ( IOException e)
        {
            System.out.println( "IOException thrown" );
        }
    }
}