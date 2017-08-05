package Unit5;

import java.io.*;

public class SongTextFileProcessor implements SongReader, SongWriter
{
    // Below I make a object of the Assignment 5 class to get the file name
    Assignment5 fileNameObject = new Assignment5();

    // This method is for reading and displaying all the songs that you have put in the text file.
    public void readSong ()
    {
        BufferedReader reader = null;

        try
        {
            // Below I read the file ''fileNameObject.getFileName()'.txt' where 'fileNameObject.getFileName()' is a method that returns the fileName
            reader = new BufferedReader ( new FileReader ( fileNameObject.getFileName() + ".txt" ) );

            String line = null;

            // This while loop is where each line is read and printed to the console.
            while ( ( line = reader.readLine() ) != null )
            {
                System.out.println ( line );
                System.out.println ();
            }
        }
        // Below I check for any Exceptions and if one occurs, "Exception thrown" is printed
        catch ( Exception e )
        {
            System.out.println ( "Exception thrown" );
        }
    }

    // This method is for writing the information the user gives into a text file.
    public void writeSong ( Song aSong )
    {
        PrintWriter writer = null;

        try
        {
            // Below I assign a object called writer to the file location of ''fileNameObject.getFileName()'.txt' where 'fileNameObject.getFileName()' is a method that returns the fileName
            writer = new PrintWriter( new BufferedWriter( new FileWriter(fileNameObject.getFileName() + ".txt", true)));

            // Below I write the input to the file
            writer.println( aSong.getTitle() + "\t\t\t" + aSong.getArtist() + "\t\t\t" + aSong.getGenre() );
            // Below I flush the stream with the flush method
            writer.flush();
        }

        // Below I check for an IO Exception and if one occurs, "IOException thrown" is printed
        catch ( IOException e )
        {
            System.out.println( "IOException thrown" );
        }

        finally
        {
            // Below I close the stream with the close method. This will always happen because of the above finally block
            writer.close();
        }
    }
}