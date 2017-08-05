package Unit5;

import java.io.*;

/**
 * Created by rahul on 7/16/2017.
 */
public class ReadTextFile
{
    public static void main(String[] args)
    {
        BufferedReader in = null;
        String line = null;

        try
        {
            in = new BufferedReader(
                    new FileReader( "tasks.txt" ) );

            while ( ( line = in.readLine() ) != null )
                System.out.println( "\n" + line + "\n");

            in.close();
        }
        catch ( IOException e )
        {
            System.out.println( "IOException thrown" );
        }
    }
}