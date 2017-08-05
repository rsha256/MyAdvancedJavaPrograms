import java.io.Serializable;

public class Student implements Serializable
{
    String name;
    String socialSecurityNum;
    int coursesCompleted;
    double grades[];
    double credits[];
    double gradePointAvg;

    // Below is my class constructor which puts the data it takes in into a corresponding setter method
    public Student( String n, String sSN, int cC, double g [], double c [], double gpa )
    {
        setName( n );
        setSocialSecurityNum( sSN );
        setCoursesCompleted( cC );
        setGrades( g );
        setCredits( c );
        setGradePointAvg( gpa );
    }

    // Below is my setter method for the student's name
    public void setName( String name )
    {
        this.name = name;
    }

    // Below is my setter method for the student's SSN
    public void setSocialSecurityNum( String socialSecurityNum )
    {
        this.socialSecurityNum = socialSecurityNum;
    }

    // Below is my setter method for the student's number of completed courses
    public void setCoursesCompleted( int coursesCompleted )
    {
        this.coursesCompleted = coursesCompleted;
    }

    // Below is my setter method for the student's grades
    public void setGrades( double[] grades )
    {
        this.grades = grades;
    }

    // Below is my setter method for the student's credits
    public void setCredits( double[] credits )
    {
        this.credits = credits;
    }

    // Below is my setter method for the student's GPA
    public void setGradePointAvg( double gradePointAvg )
    {
        this.gradePointAvg = gradePointAvg;
    }

    // Below is my getter method for the student's name
    public String getName()
    {
        return name;
    }

    // Below is my getter method for the student's SSN
    public String getSocialSecurityNum()
    {
        return socialSecurityNum;
    }

    // Below is my getter method for the student's number of courses completed
    public int getCoursesCompleted()
    {
        return coursesCompleted;
    }

    // Below is my getter method for the student's grades
    public double[] getGrades()
    {
        return grades;
    }

    // Below is my getter method for the student's credits
    public double[] getCredits()
    {
        return credits;
    }

    // Below is my getter method for the student's GPA
    public double getGradePointAvg()
    {
        return gradePointAvg;
    }
}