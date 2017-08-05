package Unit8;

import java.util.*;
public class FIFOQueue< T >
{
    private LinkedList< T > list = new LinkedList< T >();

    public void add( T item )
    {
        list.addLast( item );
    }
    public T get()
    {
        return list.removeFirst();
    }
    public int size()
    {
        return list.size();
    }
}