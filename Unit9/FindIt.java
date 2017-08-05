package Unit9;

public class FindIt extends Thread
{
    // Below are the variables that represent the starting and ending range along with the number to search for.
    private int beginSearch;
    private int endSearch;
    private int searchFor;

    /* Below is the class constructor that accepts three arguments:
    the number to search for, the number where the search should begin, and the number where the search should end.
    It then uses the setter methods to
     */
    FindIt( int searchFor, int beginSearch, int endSearch )
    {
        setSearchFor( searchFor );
        setBeginSearch( beginSearch );
        setEndSearch( endSearch );
    }

    // Below is the setter method for the start of the for loop
    private void setBeginSearch( int beginSearch )
    {
        this.beginSearch = beginSearch;
    }

    // Below is the setter method for the end of the for loop
    private void setEndSearch( int endSearch )
    {
        this.endSearch = endSearch;
    }

    // Below is the setter method for the number that is being searched for
    private void setSearchFor( int searchFor )
    {
        this.searchFor = searchFor;
    }

    // Below is the getter method for the start of the for loop
    private int getBeginSearch()
    {
        return beginSearch;
    }

    // Below is the getter method for the end of the for loop
    private int getEndSearch()
    {
        return endSearch;
    }

    // Below is the getter method for the number that is being searched for
    private int getSearchFor()
    {
        return searchFor;
    }

    /* Below is a method that searches for the number by iterating through a loop
     that iterates through a specified range of values and checks whether
     the current loop value matches the target value.
      */
    public void run()
    {
        // Below is the loop that iterates through a specified range of values
        for ( int i = getBeginSearch(); i <= getEndSearch(); i++ )
        {
            // If the number matches the current loop value,
            if ( i == getSearchFor() )
            {
                // then the thread then displays the target number and the name of the thread that found it,
                System.out.println( this.getName() + " found the number! \nThe number is " + i );
                // and then terminate.
                break;
            }
            // Every 10 times through the loop,
            if ( i % 10 == 0 )
            {
                // the thread yields.
                Thread.yield();
            }
        }
    }
}