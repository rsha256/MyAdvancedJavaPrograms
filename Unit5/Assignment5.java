package Unit5;

import java.util.Scanner;

public class Assignment5
{
    // Below is a variable that will hold the fileName
    private static String fileName;

    // This method gets the name of the '.txt' file that he user would like to store the info is
    private static void setFileName()
    {
        fileName = Input.getString( "Unit5.Input the name of the '.txt' file you would like to store this in" );
    }

    // Below is a method which returns the fileName (used to determine which file to read and write to (in the processor class))
    static String getFileName()
    {
        return fileName;
    }

    public static void main( String [] args )
    {
        // Below I make a call to the setFileName method which prompts the user to input the name of the .txt file they want
        setFileName();

        // Below I make a Scanner object called songInfo, which I use throughout the program to get user input
        Scanner songInfo = new Scanner( System.in );

        SongTextFileProcessor songProcessor = new SongTextFileProcessor();

        // Below is the variable choice which will hold the user's input of what they want to do
        String choice = "";

        while ( !( choice.equals( "exit" ) ) )
        {
            System.out.println( "\nType 'Add Unit5.Song' (without quotes) to add a song to your playlist" );
            System.out.println( "Type 'View' (without quotes) to view your entire playlist" );
            System.out.println( "Type 'exit' (without quotes) to exit the program" );

            choice = songInfo.nextLine();

            // Below I check to see whether or not you put in a compatible value
            while ( !(choice.equals( "Add Unit5.Song" ) ) & !( choice.equals( "View" ) ) & !( choice.equals( "exit" ) ) )
            {
                System.out.println( "\nThat isn't a valid choice" );
                System.out.println( "Type 'Add Unit5.Song' (without quotes) to add a song to your playlist" );
                System.out.println( "Type 'View' (without quotes) to view your entire playlist" );
                System.out.println( "Type 'exit' (without quotes) to exit the program" );

                choice = songInfo.nextLine();
            }

            /* If you chose to add a song, you will be asked the title, artist, and genre of the song.
                The program then sends this information to the writeSong method (in the Unit5.SongTextFileProcessor class),
                where it is written into a text file.
                */
            if ( choice.equals( "Add Unit5.Song" ) )
            {
                System.out.println( "\nPlease enter the title of the song" );
                String title = songInfo.nextLine();

                System.out.println( "\nPlease enter the name of the artist of the song" );
                String artist = songInfo.nextLine();

                System.out.println( "\nPlease enter the genre of the song" );
                String genre = songInfo.nextLine();

                Song inputSong = new Song( title, artist, genre );
                songProcessor.writeSong( inputSong );
            }

            /* If you chose to view your playlist, the readSong method will be called (in the Unit5.SongTextFileProcessor class), and
	           it outputs whatever text you entered
	           */
            else if ( choice.equals( "View" ) )
            {
                System.out.println();
                songProcessor.readSong();
            }
        }
    }
}