import java.io.Serializable;

class Contact implements Serializable
{
    // Below are my String variables which ho
	private String firstName ;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;

	// This is a class Constructor, for when the class is instantiated (but has not had anything passed to it yet)
	Contact()
    {
    	setFirstName( null );
    	setLastName( null );
		setPhoneNumber( null );
		setEmailAddress( null );
    }

	// This is the class constructor, which calls upon the set methods when a Contact is instantiated.
	Contact(String fN, String lN, String pN, String eA )
	{
		setFirstName( fN );
		setLastName( lN );
		setPhoneNumber( pN );
		setEmailAddress( eA );
	}

	// Below is my private (as only the class constructor needs to access it) setter method for the first name
	private void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	// Below is my private (as only the class constructor needs to access it) setter method for the last name
	private void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

	// Below is my private (as only the class constructor needs to access it) setter method for the phone number
	private void setPhoneNumber( String phoneNumber )
	{
		this.phoneNumber = phoneNumber;
	}

	// Below is my private (as only the class constructor needs to access it) setter method for the email address
	private void setEmailAddress( String emailAddress )
	{
		this.emailAddress = emailAddress;
	}

	// Below is my getter method for the first name
	String getFirstName()
	{
		return firstName;
	}

	// Below is my getter method for the last name
	String getLastName()
	{
		return lastName;
	}

	// Below is my getter method for the phone number
	String getPhoneNumber()
	{
		return phoneNumber;
	}

	// Below is my getter method for the email address
	String getEmailAddress()
	{
		return emailAddress;
	}

	// Below I override the toString method from the Object class to print the contact info
	@Override
	public String toString()
	{
		return "\n" + getLastName() + ", " + getFirstName() + "\t" + getPhoneNumber() + "\t" + getEmailAddress();
	}
}