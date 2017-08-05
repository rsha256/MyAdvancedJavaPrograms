package Unit5;

public class Song
{
    // Below are my String variables which store the title, artist, and genre respectively
    private String title;
    private String artist;
    private String genre;

    // Constructor for the three attributes
    public Song( String aTitle, String aArtist, String aGenre )
    {
        setTitle( aTitle );
        setArtist( aArtist );
        setGenre( aGenre );
    }

    // Below is the setTitle method which sets the private String variable title equal to the the parameterized input
    public void setTitle( String titleName )
    {
        title = titleName;
    }

    // Below is the setArtist method which sets the private String variable artist equal to the the parameterized input
    public void setArtist( String artistName )
    {
        artist = artistName;
    }

    // Below is the setGenre method which sets the private String variable genre equal to the the parameterized input
    public void setGenre( String genreName )
    {
        genre = genreName;
    }

    // Below is the getTitle method which returns the title (this is used to represent what should be written in the writeSong method)
    public String getTitle()
    {
        return title;
    }

    // Below is the getArtist method which returns the artist (this is used to represent what should be written in the writeSong method)
    public String getArtist()
    {
        return artist;
    }

    // Below is the getGenre method which returns the genre (this is used to represent what should be written in the writeSong method)
    public String getGenre()
    {
        return genre;
    }
}