package Unit7;

import Unit7.Child;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MySerializationIn
{
    public static void main(String[] args)
    {
        Child aChild = null;
        ObjectInputStream in = null;

        try
        {
            in = new ObjectInputStream(
                    new FileInputStream( "serialized.dat" ) );

            aChild = (Child) in.readObject();
            in.close();

            System.out.println();
            System.out.println( aChild.getX() + " " + aChild.getY() + " " + aChild.getZ() );
            System.out.println();
        }
        catch ( Exception e )
        {
            System.out.println( "Exception thrown!" );
        }
    }
}
