package Unit8;

/*
 * Created by rahul on 7/26/2017.
 */
public class GroceryItem
{
    private int itemCode;
    private int shelfLife;

    public GroceryItem()
    {

    }

    public GroceryItem ( int itemCode, int shelfLife )
    {
        if ( shelfLife  > 0 && shelfLife < 31 )
        {
            setItemCode( itemCode );
            setShelfLife( shelfLife );
        }
        else
        {
            System.out.println( "Item is spoilt." );
        }
    }

    public void setItemCode( int itemCode )
    {
        this.itemCode = itemCode;
    }

    public void setShelfLife( int shelfLife )
    {
        this.shelfLife = shelfLife;
    }

    public int getItemCode()
    {
        return itemCode;
    }

    public int getShelfLife()
    {
        return shelfLife;
    }
}