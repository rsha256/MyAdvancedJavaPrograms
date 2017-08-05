package Unit5;

import java.io.*;

/*
 * Created by rahul on 7/16/2017.
 */
public class WriteTextFile
{
    public static void main(String[] args)
    {
        int x = 10, y = 20, z = 30;
        PrintWriter out = null;

        try
        {
            out = new PrintWriter(
                  new BufferedWriter(
                  new FileWriter( "moredata.txt", true ) ) );
            out.printf( "%10d %10d %10d", x, y, z );
            // Above i could've done out.print(x + "\t") for the same result
        }
        catch ( IOException e )
        {
            System.out.println( "Writers not created" );
        }
        finally
        {
            out.close();
        }
    }
}