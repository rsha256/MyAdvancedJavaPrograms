package Unit8;/*
 * Created by rahul on 7/26/2017.
 */
import Unit8.GroceryItem;

import java.util.*;

public class ShelfLifeExercise
{
    public static void main(String[] args)
    {
        ArrayList<GroceryItem> shortLife = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> longLife = new ArrayList<GroceryItem>();
        int shelfLife = 0;

        // Create & sort grocery items
        Random rn = new Random();

        for( int i = 0; i < 50; i++ )
        {
            shelfLife = rn.nextInt( 30 ) + 1;
            GroceryItem item = new GroceryItem( i + 1, shelfLife );
            if ( shelfLife > 7 )
                longLife.add( item );
            else
                shortLife.add( item );
        }
        System.out.println( "There are " + shortLife.size() +
                " short-lived items:" );
        display( shortLife );
        System.out.println( "\nThere are " + longLife.size() +
                " long-lived items: " );
        display( longLife );
    }

    public static void display( ArrayList<GroceryItem> array )
    {
        for( GroceryItem item : array )
            System.out.println( "code: " + item.getItemCode() +
                    " shelf life: " + item.getShelfLife() );
    }
}