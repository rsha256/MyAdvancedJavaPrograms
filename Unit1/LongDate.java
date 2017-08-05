public class LongDate extends Date
{
    private String monthName;
    // above is the private String variable monthName which is private as only the LongDate class needs to acess it. It is used to hold the String that represents the month name
    
    public static void main(String[] args) 
    {
        String monthName;
        int dayNumber;
        int yearNumber;
        String monthName2;
        int dayNumber2;
        int yearNumber2;
        String monthName3;
        int dayNumber3;
        int yearNumber3;
        String monthName4;
        int dayNumber4;
        int yearNumber4;
        // above are the variables that are associated with user input (below)
        
        monthName = Input.getString("Please enter the current month name with a capital letter!");
        dayNumber = Input.getInt("Please enter the current day!");
        yearNumber = Input.getInt("Please enter the current year!");
        // above i get user input for the 1st date (using the Input class)
        
        // below i get user input for the second date (using the Input class)
        monthName2 = Input.getString("Please enter the current month name with a capital letter!");
        dayNumber2 = Input.getInt("Please enter the current day!");
        yearNumber2 = Input.getInt("Please enter the current year!");
        
        // below i get user input for the 3rd date (using the Input class)
        monthName3 = Input.getString("Please enter the current month name with a capital letter!");
        dayNumber3 = Input.getInt("Please enter the current day!");
        yearNumber3 = Input.getInt("Please enter the current year!");

        // below i get user input for the 4th date (using the Input class)
        monthName4 = Input.getString("Please enter the current month name with a capital letter!");
        dayNumber4 = Input.getInt("Please enter the current day!");
        yearNumber4 = Input.getInt("Please enter the current year!");
        
        // below i check to make sure that the month name inputted is valid
        if ( (monthName.equals("January")) || (monthName.equals("February")) || (monthName.equals("March")) || (monthName.equals("April")) || (monthName.equals("May")) || (monthName.equals("June")) || (monthName.equals("July")) || (monthName.equals("August")) || (monthName.equals("September")) || (monthName.equals("October")) || (monthName.equals("November")) || (monthName.equals("December")) )                     
        {
        }
        
        else
        {
            monthName = Input.getString("Please re-enter the current month name with a capital letter! (for the 1st date)");
            // if it's not, the user is asked to re-input the month name
        }
        
        // below i check to make sure that the 2nd month name inputted is valid
        if ( (monthName2.equals("January")) || (monthName2.equals("February")) || (monthName2.equals("March")) || (monthName2.equals("April")) || (monthName2.equals("May")) || (monthName2.equals("June")) || (monthName2.equals("July")) || (monthName2.equals("August")) || (monthName2.equals("September")) || (monthName2.equals("October")) || (monthName2.equals("November")) || (monthName2.equals("December")) )                     
        {
        }
        
        else
        {
            monthName2 = Input.getString("Please re-enter the current month name with a capital letter! (for the 2nd date)");
            // if it's not, the user is asked to re-input the 2nd month name
        }
        
        // below i check to make sure that the 3rd month name inputted is valid
        if ( (monthName3.equals("January")) || (monthName3.equals("February")) || (monthName3.equals("March")) || (monthName3.equals("April")) || (monthName3.equals("May")) || (monthName3.equals("June")) || (monthName3.equals("July")) || (monthName3.equals("August")) || (monthName3.equals("September")) || (monthName3.equals("October")) || (monthName3.equals("November")) || (monthName3.equals("December")) )                     
        {
        }
        
        else
        {
            monthName3 = Input.getString("Please re-enter the current month name with a capital letter! (for the 3rd date)");
            // if it's not, the user is asked to re-input the 3rd month name
        }
        
        // below i check to make sure that the 4th month name inputted is valid
        if ( (monthName4.equals("January")) || (monthName4.equals("February")) || (monthName4.equals("March")) || (monthName4.equals("April")) || (monthName4.equals("May")) || (monthName4.equals("June")) || (monthName4.equals("July")) || (monthName4.equals("August")) || (monthName4.equals("September")) || (monthName4.equals("October")) || (monthName4.equals("November")) || (monthName4.equals("December")) )                     
        {
        }
        
        else
        {
            monthName4 = Input.getString("Please re-enter the current month name with a capital letter! (for the 4th date)");
            // if it's not, the user is asked to re-input the 4th month name
        }
        
        // below i create a array of type Date which is populated by several Date and LomngDate objects
        Date[] dates =  
        { 
            new Date(getMonthInt(monthName), dayNumber, yearNumber ), new LongDate(monthName, dayNumber, yearNumber), 
            new Date(getMonthInt(monthName2), dayNumber2, yearNumber2 ), new LongDate(monthName2, dayNumber2, yearNumber2), 
            new Date(getMonthInt(monthName3), dayNumber3, yearNumber3 ), new LongDate(monthName3, dayNumber3, yearNumber3),
            new Date(getMonthInt(monthName4), dayNumber4, yearNumber4 ), new LongDate(monthName4, dayNumber4, yearNumber4) 
        };

        // below i loop through the dates array displaying the output of the getDate() method for each object in the array
        for (Date d: dates)
            System.out.println(d.getDate());
    }
    
    static int getMonthInt(String monthName) 
    {
        // this method 'getMonthInt' gets the month name passed in and returns a integer that corresponds with the month. It is static so that it can be called from the main method
        switch(monthName) 
        {
            case "January":
                return 1;
            case "Febuary":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                return 0;
        }
    }

    // LongDate is my class constructor  so when a LongDate object is created, the date is immediately set using the setDate method      
    public LongDate(String m, int d, int y)
    {
        super();
        setDate(m, d, y);
    }

    // Below is the setDate method, when called upon, it sets monthName to the month Name entered from the class constructor (this method is only called from the constructor). 
    // It then uses the getMonthInt method, to get the month as a number. It then calls the setDate method from the Date class (using the super keyword) which sets the 3 protected methods     // (editMonth, editDate, editYear) to their respected integer value
    public void setDate(String m, int d, int y) 
    {
        monthName = m;
        super.setDate(getMonthInt(m), d, y);
    }

    // this is the getDay method that prints the date in long form (e.g., July 4, 2017)
    public String getDate() 
    {
        return monthName + " " + super.getDay() + ", " + super.getYear();
    }

    // in the Date class there is a getDate method that returns the date as mm/dd/yy. So i call the method above using super to refer to the getDate method from the Date class
    public String getShortDate() 
    {
        return super.getDate();
    }
}