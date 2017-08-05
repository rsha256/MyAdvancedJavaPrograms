import java.util.Scanner;

public class Assignment6
{
    // Below is a variable that will hold the fileName
    private static String fileName;

    // This method gets the name of the '.dat' file that the user would like to store the info in
    private static void setFileName()
    {
        fileName = Input.getString( "Input the name of the '.dat' file you would like to store this in (without the .dat at the end)" );
    }

    // Below is a method which returns the fileName (used to determine which file to read and write to (in the processor class))
    static String getFileName()
    {
        return fileName + ".dat";
    }

    public static void main( String [] args )
    {
        // Below I make a call to the setFileName method which prompts the user to input the name of the .dat file they want
        setFileName();

        // Below I make a Scanner object called songInfo, which I use throughout the program to get user input
        Scanner songInfo = new Scanner( System.in );

        SongBinaryFileProcessor songProcessor = new SongBinaryFileProcessor();

        // Below is the variable choice which will hold the user's input of what they want to do
        String choice = "";

        // if the user chooses to type exit, then because of the line below the program will end
        while ( !( choice.equals( "exit" ) ) )
        {
            // Below are some lines to prompt the user
            System.out.println( "\nType 'Add Song' (without quotes) to add a song to your playlist" );
            System.out.println( "Type 'View' (without quotes) to view your entire playlist" );
            System.out.println( "Type 'exit' (without quotes) to exit the program" );

            // Below i read in the user's choice using the nextLine method to account for spaces
            choice = songInfo.nextLine();

            // Below I check to see whether or not you put in a compatible value
            while ( !(choice.equals( "Add Song" ) ) & !( choice.equals( "View" ) ) & !( choice.equals( "exit" ) ) )
            {
                // Below are some lines to prompt the user
                System.out.println( "\nThat isn't a valid choice" );
                System.out.println( "Type 'Add Song' (without quotes) to add a song to your playlist" );
                System.out.println( "Type 'View' (without quotes) to view your entire playlist" );
                System.out.println( "Type 'exit' (without quotes) to exit the program" );

                // Below i read in the user's choice using the nextLine method to account for spaces

                choice = songInfo.nextLine();
            }

            /* If you chose to add a song, you will be asked the title, artist, and genre of the song.
                The program then sends this information to the writeSong method (in the SongBinaryFileProcessor class),
                where it is written into the file.
                */
            if ( choice.equals( "Add Song" ) )
            {
                // Below I prompt the user for the title name
                System.out.println( "\nPlease enter the title of the song" );
                // Below I read the user's input
                String title = songInfo.nextLine();

                // Below I prompt the user for the artist name
                System.out.println( "\nPlease enter the name of the artist of the song" );
                // Below I read the user's input
                String artist = songInfo.nextLine();

                // Below I prompt the user for the song genre
                System.out.println( "\nPlease enter the genre of the song" );
                // Below I read the user's input
                String genre = songInfo.nextLine();

                // Below I create an object of type Song, with the user's input as parameters (which will be put into setter methods in the Song class because of the Song class's class constructor)
                Song inputSong = new Song( title, artist, genre );
                // Below I use songProcessor (an object of the SongBinaryFileProcessor class) to call upon the SongBinaryFileProcessor class's implemented writeSong method where i pass inputSong (a object of class Song)

                songProcessor.writeSong( inputSong );
            }

            // If you chose to view your playlist, the readSong method will be called (from the SongBinaryFileProcessor class where it is implemented), and it outputs the songs
            else if ( choice.equals( "View" ) )
            {
                // Below I print a linefeed for clarity
                System.out.println();
                // Below I use a object of the SongBinaryFileProcessor class to call upon the SongBinaryFileProcessor class's implemented readSong method
                songProcessor.readSong();
            }
        }
    }
}