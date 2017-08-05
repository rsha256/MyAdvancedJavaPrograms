public class Bluebirds extends Birds
{
    // Below is the age method which if called upon will print the average age for a Bluebird    
    public void age()
    {
        System.out.println( "The average age of a Bluebird is 8 years!" );
    }
    
    // Below is the weight method which if called upon will print the average weight for a Bluebird        
    public void weight()
    {
        System.out.println( "The average weight of a Bluebird is 27.5 g." );    
    }
    
    // Below is the doTricks method which if called upon will print the trick for a Bluebird        
    public void doTricks()
    {
        System.out.println( "The Bluebird is flying" );
    }
    
    // Below is the makeSound method which when called upon will print the sound made by a Bluebird        
    public String makeSound()
    {
        return "eek eek eek";
    }
}