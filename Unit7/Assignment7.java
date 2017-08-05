import java.util.Scanner;
import java.io.*;

public class Assignment7
{
    public static void main( String [] args )
    {
        // Below are 3 strings that will be used for storing the user's input for the names of the students
        String name1 = null;
        String name2 = null;
        String name3 = null;
        // Below are 3 strings that will be used for storing the user's input for the SSN of the students
        String socialSecurityNumber1 = null;
        String socialSecurityNumber2 = null;
        String socialSecurityNumber3 = null;
        // Below are 3 ints that store the user's input for the number of courses completed of the students
        int coursesCompleted1 = 0;
        int coursesCompleted2 = 0;
        int coursesCompleted3 = 0;
        // Below are arrays that will store the grades for the students
        double grade1[] = new double[ 8 ];
        double grade2[] = new double[ 8 ];
        double grade3[] = new double[ 8 ];
        // Below are arrays that will store the credit values of the courses
        double credits1[] = new double[ 8 ];
        double credits2[] = new double[ 8 ];
        double credits3[] = new double[ 8 ];
        // Below are 3 double precision variables that will hold the grade point average value
        double gpa1;
        double gpa2;
        double gpa3;
        // Below is a variable that holds the number of courses the student is in
        int courses;

        // Below I use the Scanner class to create an object to read input from System.in
        Scanner input = new Scanner( System.in );

        // The for loop below allows you to input the name of the 3 students
        for ( int n = 1; n <= 3; n++ )
        {
            // Below I prompt the user to enter the student name using int n for specificity
            System.out.println ( "Enter the name of student #" + n );

            // if the for loop is on it's 1st try then it should store input to the String 'name1'
            if ( n == 1 )
                name1 = input.nextLine();
            // if the for loop is on it's 2nd try then it should store input to the String 'name2'
            else if ( n == 2 )
                name2 = input.nextLine();
            // if the for loop is on it's 3rd try then it should store input to the String 'name3'
            else if ( n == 3 )
                name3 = input.nextLine();
        }

        // The for loop below allows you to input the social security number of the 3 students
        for ( int s = 1; s <= 3; s++ )
        {
            // Below I prompt the user to enter the student's SSN using int s for specificity
            System.out.println ( "Enter the social security number of student #" + s );

            // if the for loop is on it's 1st try then it should store input to the String 'socialSecurityNumber1'
            if ( s == 1 )
                socialSecurityNumber1 = input.nextLine();
            // if the for loop is on it's 2nd try then it should store input to the String 'socialSecurityNumber2'
            else if ( s == 2 )
                socialSecurityNumber2 = input.nextLine();
            // if the for loop is on it's 3rd try then it should store input to the String 'socialSecurityNumber3'
            else if ( s == 3 )
                socialSecurityNumber3 = input.nextLine();
        }

        // Allows you to input the number of courses each of the three students took
        for ( int c = 1; c <= 3; c++ )
        {
            // Below I prompt the user to enter the number of completed courses
            System.out.println ( "Enter the number of courses student #" + c + " completed (up to 8 courses)" );

            // Below I store the user's input to the variable courses
            //Note that since this in a for loop the value of courses will be overwritten each time around with the value of the next student's completed courses
            courses = input.nextInt();

            // The array I made only has space for 8 courses max. so if you enter more, the value is reduced
            if ( courses > 8 )
                courses = 8;
            // Below I make sure that the user didn't input a negative number of courses ( or zero courses)
            else if ( courses < 1 )
                courses = 1;

            // if the for loop is on it's 1st try then coursesCompleted1 should be equal to courses
            if ( c == 1 )
                coursesCompleted1 = courses;
            // if the for loop is on it's 2nd try then coursesCompleted2 should be equal to courses current value
            else if ( c == 2 )
                coursesCompleted2 = courses;
            // if the for loop is on it's 3rd try then coursesCompleted3 should be equal to courses current value
            else if ( c == 3 )
                coursesCompleted3 = courses;

            // The for loop below allows you to input the students grades for their courses
            for ( int e = 1; e <= courses; e++ )
            {
                // Below I prompt the user
                System.out.println( "Enter student #" + c + "'s grade in course #" + e + " (a decimal value between 0 and 100)" );

                // Below I store the grade to a variable called 'grade'
                double grade = input.nextDouble();

                // Below I check to make sure that the grade is a valid value
                if ( grade > 100 )
                    grade = 100;
                else if ( grade < 0 )
                    grade = 0;

                // if c == 1 means if you are on student 1
                if ( c == 1 )
                    grade1[ e - 1 ] = grade;
                // if c == 2 means if you are on student 2
                if ( c == 2 )
                    grade2[ e - 1 ] = grade;
                // if c == 3 means if you are on student 3
                if ( c == 3 )
                    grade3[ e - 1 ] = grade;
            }

            // The for loop below allows you to input the credit value of the courses
            for ( int f = 1; f <= courses; f++ )
            {
                // Below I prompt the user to enter the credit value
                System.out.println( "Enter the credit value of course #" + f + " (a decimal value greater than 1)" );

                // Below I store the credit value to a variable called 'credits'
                double credits = input.nextDouble();

                // I make sure that the credit is greater than 1 (negative, 0 and other values are unreasonable)
                if ( credits < 1 )
                    credits = 1;

                // Depending on where the outer for loop (that decides the # of courses) is (in terms of students)
                if ( c == 1 )
                    // the credit value is stored to the corresponding array subset
                    credits1[ f - 1 ] = credits;
                // Depending on where the outer for loop (that decides the # of courses) is (in terms of students)
                if ( c == 2 )
                    // the credit value is stored to the corresponding array subset
                    credits2[ f - 1 ] = credits;
                // Depending on where the outer for loop (that decides the # of courses) is (in terms of students)
                if ( c == 3 )
                    // the credit value is stored to the corresponding array subset

                    credits3[ f - 1 ] = credits;
            }
        }

        // Below the GPA is calculated by passing the CalculateGPA method an array of grades and an array of credits. The calculated GPA is then stored to the double precision variable 'gpa1'
        gpa1 = CalculateGPA( grade1, credits1 );
        // Below the GPA is calculated by passing the CalculateGPA method an array of grades and an array of credits. The calculated GPA is then stored to the double precision variable 'gpa2'
        gpa2 = CalculateGPA( grade2, credits2 );
        // Below the GPA is calculated by passing the CalculateGPA method an array of grades and an array of credits. The calculated GPA is then stored to the double precision variable 'gpa3'
        gpa3 = CalculateGPA( grade3, credits3 );

        // Below I make an object of the 'Student' class 's1' which passes student #1's data to the Student class
        Student s1 = new Student( name1, socialSecurityNumber1, coursesCompleted1, grade1, credits1, gpa1 );
        // Below I make an object of the 'Student' class 's2' which passes student #2's data to the Student class
        Student s2 = new Student( name2, socialSecurityNumber2, coursesCompleted2, grade2, credits2, gpa2 );
        // Below I make an object of the 'Student' class 's3' which passes student #3's data to the Student class
        Student s3 = new Student( name3, socialSecurityNumber3, coursesCompleted3, grade3, credits3, gpa3 );

        // Below I make a variable of the ObjectOutputStream class which I'll later use to write objects to a file
        ObjectOutputStream out = null;

        // Below I write the objects into a data file
        try
        {
            out = new ObjectOutputStream(
                  new BufferedOutputStream(
                  new FileOutputStream( "students.dat" ) ) );

            // Below I write the object 's1' to the file "students.dat"
            out.writeObject( s1 );
            // Below I write the object 's2' to the file "students.dat"
            out.writeObject( s2 );
            // Below I write the object 's3' to the file "students.dat"
            out.writeObject( s3 );

            // Below I flush and close the stream to prevent data loss
            out.flush();
            out.close();
        }
        // Since the methods above can throw an IOException, I account for that with try and catch blocks
        catch ( IOException e )
        {
            // If an IOException is thrown 'IOException thrown' is printed
            System.out.println ( "IOException thrown" );
        }

        // Below I make a variable of the ObjectInputStream class which I'll later use to read objects from a file
        ObjectInputStream in = null;

        // Below I read the objects from the data file and print out the information
        try
        {
            // Below I set the stream in to the "products.dat" file
            in = new ObjectInputStream(
                 new BufferedInputStream(
                 new FileInputStream( "students.dat" ) ) );

            // Below I print the student data. This is done thrice to account for all 3 students
            for ( int f = 0; f < 3; f++ )
            {
                // Below I cast from the Object class to the Student class
                Student studentObj = ( Student ) in.readObject();

                // Below I print the student's info
                System.out.println ( "\nName: " + studentObj.getName() + "\tSSN: " + studentObj.getSocialSecurityNum()
                        + "\t# of courses completed: " + studentObj.getCoursesCompleted() + "\tGPA: " + studentObj.getGradePointAvg() );
            }
        }
        // Since an Exception can be thrown in the above try block I account for it with the catch block below
        catch ( Exception e )
        {
            // If an Exception is thrown 'Exception thrown' is printed
            System.out.println( "Exception thrown" );
        }
    }

    // Below I calculate the GPA of a student using their grades and the credit values of their courses
    private static double CalculateGPA( double g [], double c [] )
    {
        // Below I call the NumberToPointGrade method
        for ( int a = 0; a < 8; a++ )
            g[ a ] = NumberToPointGrade( g[ a ] );

        // Below I calculate the GPA using the steps at: "tiny.cc/a7calcgpa"
        double qualityPoints = ( g[ 0 ] * c[ 0 ] ) + ( g[ 1 ] * c[ 1 ] ) + ( g[ 2 ] * c[ 2 ] ) + ( g[ 3 ] * c[ 3 ] )
                + ( g[ 4 ] * c[ 4 ] ) + ( g[ 5 ] * c[ 5 ] ) + ( g[ 6 ] * c[ 6 ] ) + ( g[ 7 ] * c[ 7 ] );

        double creditHours = c[ 0 ] + c[ 1 ] + c[ 2 ] + c[ 3 ] + c[ 4 ] + c[ 5 ] + c[ 6 ] + c[ 7 ];

        return qualityPoints / creditHours;
    }

    // The method below converts the number grade that is passed to it into a grade point average (GPA)
    private static double NumberToPointGrade( double grade )
    {
        // Below I initialize the double precision variable gradeValue to 0
        double gradeValue = 0;

        if ( grade <= 100 && grade >= 93 )
            gradeValue = 4;
        else if ( grade < 93 && grade >= 90 )
            gradeValue = 3.67;
        else if ( grade < 90 && grade >= 87 )
            gradeValue = 3.33;
        else if ( grade < 87 && grade >= 83 )
            gradeValue = 3;
        else if ( grade < 83 && grade >= 80 )
            gradeValue = 2.27;
        else if ( grade < 80 && grade >= 77 )
            gradeValue = 2.33;
        else if ( grade < 77 && grade >= 73 )
            gradeValue = 2;
        else if ( grade < 73 && grade >= 70 )
            gradeValue = 1.67;
        else if ( grade < 70 && grade >= 67 )
            gradeValue = 1.33;
        else if ( grade < 67 && grade >= 63 )
            gradeValue = 1;
        else if ( grade < 63 && grade >= 60 )
            gradeValue = 0.67;
        else if ( grade < 60 )
            gradeValue = 0;

        return gradeValue;
    }
}