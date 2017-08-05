package Unit6;

import java.io.*;
import java.util.*;
public class ReadBinaryFileExercise
{
    public static void main( String [] args )
    {
        DataInputStream in = null;
        try
        {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream( "products.dat" ) ));
            while ( in.available() > 0 )
            {
                int productNum = 0;
                String productName = "";
                int quantity = 0;
                double cost = 0;
                productNum = in.readInt();
                // Must read String char by char
                for( int j = 0; j < 15; j++ )
                    productName += in.readChar();

                quantity = in.readInt();
                cost = in.readDouble();
                System.out.println( productNum + "\t\t" +
                        productName + "\t\t" +
                        quantity + "\t\t" + cost );
            }
            in.close();
        }
        catch( Exception e )
        {
            System.out.println( "Error writing to file" );
        }
    }
}