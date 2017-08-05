package Unit5;

import java.io.*;

public class CreateDirectoryAndFile
{
    public static void main( String [] args )
    {
        String dirName = "MyDirectory";
        String fName = dirName + "/" + "MyFile.txt";
        File dir = new File( dirName );
        File f = new File( fName );

        if ( dir.mkdir() )
        {
            try
            {
                f.createNewFile();
            }
            catch ( Exception e )
            {
                System.out.println( "FILE NOT CREATED" );
            }
            finally
            {
                System.out.println("\nAbsolute Path Name is "
                        + f.getAbsolutePath() );
            }
        }
        else
            System.out.println( "DIRECTORY NOT CREATED" );
    }
}