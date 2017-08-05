import javax.swing.*;


public class Input
{
    public static byte getByte( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Byte.parseByte( input );
    }

    public static short getShort( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Short.parseShort( input );
    }

    public static int getInt( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Integer.parseInt( input );
    }

    public static long getLong( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Long.parseLong( input );
    }

    public static float getFloat( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Float.parseFloat( input );
    }

    public static double getDouble( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Double.parseDouble( input );
    }

    public static boolean getBoolean( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return Boolean.parseBoolean( input );
    }

    public static char getChar( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return input.charAt(0);
    }

    public static String getString( String s )
    {
        String input = JOptionPane.showInputDialog( s );
        return input;
    }

}
