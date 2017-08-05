package Unit5;

import java.io.*;
import java.util.*;

/*
 * Created by rahul on 7/16/2017.
 */
public class TaskFileReaderExercise
{
    public static void main(String[] args)
    {
        Date d = null;
        String line = null;
        BufferedReader in = null;

        try
        {
            in = new BufferedReader(
                 new FileReader( "tasks.txt" ) );

            while ( ( line = in.readLine() ) != null )
            {
                String s = line.substring( 0, 5 );
                int taskNum = Integer.parseInt( s.trim() );
                String task = line.substring( 5, 35 );
                String date = line.substring( 35, 50 );

                System.out.println( "Task # " + taskNum );
                System.out.println( "Task: " + task.trim() );
                System.out.println( "Date:  " + date.trim() );
            }
            in.close();
        }
        catch ( Exception e )
        {
            System.out.println( "Error reading file" );
        }
    }
}
