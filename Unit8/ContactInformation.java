import java.io.*;
import java.util.*;

public class ContactInformation
{
    // Below is a variable which holds the capacity for the ArrayList. This variable is used in the setCapacity method
    private int capacity;

    // Below I make the ArrayList which i name contacts, and set to a capacity of 5
    List< Contact > contacts = new ArrayList< Contact > ( 5 );


    // Below I make a variable 'out' of the ObjectOutputStream class which may later be used to write to a '.dat' file
    ObjectOutputStream out = null;

    // Below I make a variable 'writer' of the PrintWriter class which may later be used to write to a '.txt' file
    PrintWriter writer = null;

    // Below I instantiate an object of the Contact class
    Contact addContact = new Contact();

    // Below I instantiate another object of the Contact class
    Contact placeHolder = new Contact();

	public static void main( String [] args )
	{
	    // Below I make a variable of the Scanner class to hold user input throughout the main method
        Scanner contact = new Scanner( System.in );

        // Below I instantiate this class so I am able to call non-static methods from the static main method
		ContactInformation contactManager = new ContactInformation();

		// Below i get the file name from the user
		System.out.println( "Name the file that you want to store your data in (with either a .txt or a .dat file extension)" );
		String file = contact.nextLine();
		// Below I pass the file name (file) which i got from the user above into the getFileExtension method to get the file extension
		String extension = getFileExtension( file );

		// Below i use the object of the ContactInformation class (contactManager) to call the setContacts method (as a placeholder)
		contactManager.setContacts();

		// Below I clear the ArrayLIst of it's null values (that it was initialized to in a class constructor of the Contact class)
		contactManager.clearContacts();

		// Below I declare and initialize a String variable which is used throughout the program to store the user's choice
		String choice = "";

		// This loop continues until you enter "5", which stops the loop, and the program.
		while ( !(choice.equals( "5" ) ) )
		{
			// Below I display the instructions
			System.out.println( "\nPress 1 if you want to add a contact" );
			System.out.println( "Press 2 if you want to delete a contact" );
			System.out.println( "Press 3 if you want to clear your contact list" );
			System.out.println( "Press 4 if you want to view your entire contact list" );
			System.out.println( "Press 5 if you want to exit the program" );
            System.out.println( "Press 6 if you want to view the number of contacts in your list" );
            System.out.println( "Press 7 if you want to change the file name" );
            // Below what ever the user inputted is stored to the String variable choice
			choice = contact.nextLine();

			// Below is a while loop which will be skipped over if a valid value is inputted
			while ( !(choice.equals( "1" ) ) & !(choice.equals( "2" ) ) & !(choice.equals( "3" ) ) & !(choice.equals( "4" ) )
                    & !(choice.equals( "5" ) ) & !(choice.equals( "6" ) ) & !(choice.equals( "7" ) ) )
			{
				// If you input an improper value, you are told that you inputted an improper value
				System.out.println( "That isn't a valid input" );
				// Then the instructions are re-displayed
				System.out.println( "Press 1 if you want to add a contact" );
				System.out.println( "Press 2 if you want to delete a contact" );
				System.out.println( "Press 3 if you want to clear your contact list" );
				System.out.println( "Press 4 if you want to view your entire contact list" );
				System.out.println( "Press 5 if you want to exit the program" );
                System.out.println( "Press 6 if you want to view the number of contacts in your list" );
                System.out.println( "Press 7 if you want to change the file name" );
                // Below whatever the user re-inputted, overwrites choice's current value
				choice = contact.nextLine();
			}
		
			// Below is a switch statement that calls a method based on the user's input
			switch ( choice )
			{
				// If the user inputted 1
				case "1":
					// then the addContact method will be called
					contactManager.addContact();

                    // And the extension is .txt
                    if ( extension.equals( ".txt" ) )
                    {
                        // write to text file
                        contactManager.writeTextContactList( file );
                    }
                    // And the extension is .dat
                    else if ( extension.equals( ".dat" ) )
                    {
                        // then the viewContactList method will be called passing the file name (file)
                        contactManager.writeBinaryContactList( file );
                    }
                    else
                    {
                        System.out.println( "file extension should be either .txt or .dat" );
                    }
					break;
				// If the user inputted 2
				case "2":
					// then the deleteContact method will be called
					contactManager.deleteContact();

                    // And the extension is .txt
                    if ( extension.equals( ".txt" ) )
                    {
                        // write the updated info to text file
                        contactManager.writeTextContactList( file );
                    }
                    // And the extension is .dat
                    else if ( extension.equals( ".dat" ) )
                    {
                        // write the updated info to the binary file
                        contactManager.writeBinaryContactList( file );
                    }
                    else
                    {
                        System.out.println( "file extension should be either .txt or .dat" );
                    }
					break;
				// If the user inputted 3
				case "3":
					// then the clearContacts method will be called
					contactManager.clearContacts();
					// along with a message to alert the user that the contacts have been cleared
					System.out.println( "Contacts have been cleared" );

					// And the extension is .txt
                    if ( extension.equals( ".txt" ) )
                    {
                        // write the updated info to text file
                        contactManager.writeTextContactList( file );
                    }
                    // And the extension is .dat
                    else if ( extension.equals( ".dat" ) )
                    {
                        // write the updated info to the binary file
                        contactManager.writeBinaryContactList( file );
                    }
                    else
                    {
                        System.out.println( "file extension should be either .txt or .dat" );
                    }
					break;
				// If the user inputted 4
				case "4":
                    // Below I sort the list by last name
                    contactManager.contacts.sort( Comparator.comparing( Contact :: getLastName ) );
                    contactManager.contacts.forEach( System.out :: println );
					break;
                // If the user inputted 6
                case "6":
                    // then the inList method will be printed
                    System.out.println( contactManager.inList() );
                    break;
                // If the user inputted 7
                case "7":
                    // Then the user can rename the file
                    System.out.println( "Name the new file that you want to store your data in (with either a .txt or a .dat file extension)" );
                    System.out.println( "Note that this will clear your current contact list" );
                    file = contact.nextLine();
                    // Below I clear the contacts of the new file to prevent a FileNotFoundException, since the file name was just changed
                    contactManager.clearContacts();
                    break;
			}
		}
	}


    // Below is the setContacts method (a placeholder method)
	private void setContacts()
	{
		for ( int g = 0; g < contacts.size(); g++ )
			contacts.add( placeHolder );
	}

    // This method adds a contact to the contact list only if the contact list isn't full
	private void addContact()
	{
        // Below I make a variable of the Scanner class to hold user input throughout the addContact method
        Scanner contact = new Scanner( System.in );

        // Below I get input for the first name and store it to the String variable 'firstName'
        System.out.println( "Enter the first name of the contact" );
		String firstName = contact.nextLine();

        // Below I get input for the last name and store it to the String variable 'lastName'
        System.out.println( "Enter the last name of the contact" );
		String lastName = contact.nextLine();

        // Below I get input for the phone number and store it to the String variable 'phoneNumber'
        System.out.println( "Enter the phone number of the contact" );
		String phoneNumber = contact.nextLine();

        // Below I get input for the email address and store it to the String variable 'emailAddress'
        System.out.println( "Enter the email address of the contact" );
		String emailAddress = contact.nextLine();

		// Below I add the info to the object of the Contact class (addContact)
		addContact = new Contact( firstName, lastName, phoneNumber, emailAddress );

		// Below I add the object of the Contact class (addContact) to the ArrayList (contacts)
		contacts.add( addContact );
	}

    // This method deletes a contact of your specification. You have to enter the position of the contact to delete that contact (1 to delete first contact).
	private void deleteContact()
	{
        // Below I make a variable of the Scanner class to hold user input throughout the main method
        Scanner contact = new Scanner( System.in );

        // If the ArrayList is not empty do the following
        if ( !contacts.isEmpty() )
		{
			// If someone enters a non-integer value, an exception can occur so a try and catch block is used
			try
			{
                // Below I prompt the user to type a int representing a contact
				System.out.println( "Enter which contact you want to delete (enter a number from 1-" + contacts.size() + ")" );
				int deleteContact = contact.nextInt();

				// Below is where the contact is actually deleted
				if ( deleteContact == 1 )
				{
					contacts.remove( 0 );
				}
				else if ( deleteContact == 2 )
				{
					contacts.remove(1);
				}
				else
				{
				    if ( deleteContact - 1 <= contacts.size() )
				    {
                        contacts.remove(deleteContact - 1);
                    }
                    else
                    {
                        System.out.println( "There is no contact at the specified index" );
                    }
				}
			}
            // Since an Exception can be thrown, I account for it below
			catch ( Exception e )
			{
				System.out.println( "That isn't a proper input" );
				System.out.println();
			}
		}
		// if contacts.isEmpty returns true then the statement below is printed
		else
			System.out.println( "There are no contacts to delete" );
	}

    // This method clears your contact list.
	private void clearContacts()
	{
		contacts.clear();
	}

	// This method writes to a .dat file
	private void writeBinaryContactList( String fileName )
    {
        // When the user decides they want to view what's in the .dat file, is when the info is actually written to the .dat file
        try
        {
            out = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream( fileName ) ) );

            for ( int f = 0; f < contacts.size(); f++ )
                out.writeObject( contacts.get( f ) );

            out.flush();
            out.close();
        }
        catch ( IOException e )
        {
            System.out.println( "IOException thrown" );
        }

    }

    // This method shows your entire contact list
	private void viewBinaryContactList( String fileName )
	{

		// we can now read from the file (below)

        // Below I create a variable of type ObjectInputStream
        ObjectInputStream in = null;

		// Since an Exception can occur, try and catch blocks are used
		try
		{
			in = new ObjectInputStream(
					new BufferedInputStream(
					new FileInputStream( fileName ) ) );

			for ( int c = 0; c < contacts.size(); c++ )
			{
				Contact cI = ( Contact )in.readObject();

				System.out.println( cI.getLastName() + ", " + cI.getFirstName() + "\t" + cI.getPhoneNumber() + "\t" + cI.getEmailAddress() );
			}

			in.close();
		}
		catch ( Exception e )
		{
			System.out.println( "You have no contacts" );
		}
	}

    // This method writes to a .txt file
	private void writeTextContactList( String fileName )
    {
        // Below the info is written to the .dat file
        try
        {
            writer = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter( fileName ) ) );

            for ( int i = 0; i < contacts.size(); i++ )
                writer.println( contacts.get( i ) );

            writer.close();
        }
        catch ( IOException e )
        {
            System.out.println( "IOException thrown" );
        }
    }

    // The method below reads the .txt file
	private void viewTextContactList( String fileName )
	{
		//Below we read from the text file
		BufferedReader reader = null;
		try
        {
			reader = new BufferedReader(
			         new FileReader( fileName ) );
			String line = null;

			// Below is a do-while loop
			do
            {
				line = reader.readLine();

				// if there's something, print it
				if ( line != null )
				{
					System.out.println( line );
				}
			}
			// when there's nothing (null) exit out of the loop
			while( line != null );

		}
		// Because an Exception can be thrown, I catch it below
		catch ( Exception e )
        {
            // Below i trace the exception to find out exactly what happened
			e.printStackTrace();
		}
		// Even if a Exception occurs, I still want to close the reader variable to prevent a leak from the BufferedReader class
		finally
        {
			if( reader != null )
				try
                {
					reader.close();
				}
				catch ( IOException e )
                {
				}
		}
	}

	// The method below returns the extension (which is used in the main method to determine if what was returned below is '.dat' or '.txt')
	private static String getFileExtension( String fileName )
	{
		int dotIndex = fileName.lastIndexOf( '.' );
		// to prevent exception if there is no dot
		if ( dotIndex >= 0 )
		{
			fileName = fileName.substring( dotIndex, fileName.length() );
		}

		return fileName;
	}

    // Below is the inList method which returns the number of contacts in your list
    private String inList()
    {
        // This if statement is purely for the purpose of correct grammar
        if ( contacts.size() == 1 )
        {
            return "\nThere is currently 1 contact in your contact list!\n";
        }
        else
        {
            return "\nThere are currently " + contacts.size() + " contacts in your contact list!\n";
        }
    }
}