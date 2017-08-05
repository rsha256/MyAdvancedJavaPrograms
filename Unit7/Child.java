package Unit7;

import java.io.*;

public class Child extends Parent implements Serializable
{
    private int z;

    public Child()
    {

    }

    public Child( int x, int y, int z )
    {

    }

    public void setZ( int z )
    {
        this.z = z;
    }

    public int getZ()
    {
        return z;
    }

    private void writeObject( ObjectOutputStream out ) throws IOException, ClassNotFoundException
    {
        out.writeInt( getX() );
        out.writeInt( getY() );
        out.writeInt( z );
    }

    private void readObject( ObjectInputStream in ) throws IOException
    {
        setX( in.readInt() );
        setY( in.readInt() );
        z = in.readInt();
    }
}
