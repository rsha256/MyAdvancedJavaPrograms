package Unit7;/*
 * Created by rahul on 7/24/2017.
 */
import Unit7.Child;

import java.io.*;

public class MySerializationOut
{
    public static void main(String[] args)
    {
        Child aChild  = new Child( 10, 20, 30 );

        ObjectOutputStream out = null;

        try
        {
            out = new ObjectOutputStream(
                  new FileOutputStream( "serialized.dat" ) );

            out.writeObject( aChild );
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace( System.err );
            System.exit( 1 );
        }
    }
}
