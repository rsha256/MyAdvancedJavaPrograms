package Unit5;

import java.io.*;
import java.util.*;

/**
 * Created by rahul on 7/16/2017.
 */
public class ReadDataWithScanner
{
    public static void main(String[] args)
    {
        BufferedReader in = null;
        Scanner fileScanner = null;
        try
        {
            in = new BufferedReader( new FileReader( "moredata.txt" ) );
            fileScanner = new Scanner( in );
            while ( fileScanner.hasNext() )
            {
                int n = fileScanner.nextInt();
                System.out.println( "\n" + n );
            }
            in.close();
            System.out.println();
        }
        catch ( Exception e )
        {
            System.out.println( "Exception thrown!" );
            e.printStackTrace();
        }
    }
}
