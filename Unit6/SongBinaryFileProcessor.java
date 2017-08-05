import java.io.*;

public class SongBinaryFileProcessor implements SongReader, SongWriter
{
    // Below I make a object of the Assignment6 class which will be used to get the file name
    Assignment6 fileNameObject = new Assignment6();

    // This method is for reading and displaying all the songs that you have put in the binary file.
    public void readSong ()
    {
        // Below i initialize a variable of type DataInputStream to null
        DataInputStream reader = null;

        try
        {
            // Below I create a array of bytes
            byte [] buffer = new byte [ 1000 ];

            // Below I read the file 'fileNameObject.getFileName()' where 'fileNameObject.getFileName()' is a method that returns the fileName (with the '.dat' extension)
            reader = new DataInputStream (
                     new BufferedInputStream (
                     new FileInputStream( fileNameObject.getFileName() ) ) );

            int aReader = 0;

            // This while loop is where each line is read and printed to the console.
            while ( ( aReader = reader.read( buffer ) ) != -1 )
                System.out.println ( new String( buffer ) );
            reader.close();
        }
        // Below I check for a IOExceptions and if one occurs, "IOException thrown" is printed
        catch ( IOException e )
        {
            System.out.println ( "IOException thrown" );
        }
    }

        // This method is for writing the information the user gives into the file.
    public void writeSong ( Song aSong )
    {
        // Below I initialize the variable writer of class DataOutputStream to null
        DataOutputStream writer = null;

        try
        {
            // Below I assign a variable called writer to the file location of 'fileNameObject.getFileName()' where 'fileNameObject.getFileName()' is a method that returns the fileName
            writer = new DataOutputStream( new BufferedOutputStream( new FileOutputStream(fileNameObject.getFileName(), true)));

            // Below I write the input to the file
            String line =  aSong.getTitle() + "\t\t\t" + aSong.getArtist() + "\t\t\t" + aSong.getGenre();

            // Below I write the String line with the writeChars method
            writer.writeChars( line );
            // Below I write a linefeed for neatness and clarity
            writer.writeChar( '\n' );
            // Below I flush the stream with the flush method
            writer.flush();
            // Below I close the stream
            writer.close();
        }

        // Below I check for an IO Exception and if one occurs, "IOException thrown" is printed
        catch ( IOException e )
        {
            System.out.println( "IOException thrown" );
        }
    }
}