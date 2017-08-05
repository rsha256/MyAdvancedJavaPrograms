package Unit6;

import java.io.*;

public class WriteBinaryFileExercise
{
    public static void main( String [] args )
    {
        int [] productNum =
                {
                        110,
                        520,
                        178,
                        172
                };

        String [] productName =
                {
                        "Hammer",
                        "Lawn Mower",
                        "Monkey Wrench",
                        "Screwdriver"
                };

        int [] quantity =
                {
                        20,
                        8,
                        52,
                        150
                };

        double [] cost =
                {
                        12.99,
                        79.52,
                        6.95,
                        5.99
                };

        DataOutputStream out = null;

        try
        {
            out = new DataOutputStream(
                  new BufferedOutputStream(
                  new FileOutputStream( "products.dat" ) ) );

            for ( int i = 0; i < 4; i++ )
            {
                out.writeInt( productNum[ i ] );
                out.writeChars( productName[ i ] );
                out.writeInt( quantity[ i ] );
                out.writeDouble( cost[ i ] );
            }
            out.close();
        }

        catch ( Exception e )
        {
            System.out.println( "Error writing to file" );
        }
    }
}