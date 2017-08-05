public class Robins extends Birds
{
    // Below is the age method which if called upon will print the average age for a Robin
    public void age()
    {
        System.out.println( "The average age of a Robin is 13 months!" );
    }
    
    // Below is the weight method which if called upon will print the average weight for a Robin    
    public void weight()
    {
        System.out.println( "The average weight of a Robin is 2.7 oz." );
    }
    
    // Below is the doTricks method which if called upon will print the trick for a Robin    
    public void doTricks()
    {
        System.out.println( "The Robin is flying" );        
    }
    
    // Below is the makeSound method which when called upon will print the sound made by a Robin    
    public String makeSound()
    {
        return "chirp chirp";        
    }
}