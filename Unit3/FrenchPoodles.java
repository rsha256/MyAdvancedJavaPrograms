public class FrenchPoodles extends Dogs
{
    // Below is the doTricks method which if called upon will print tricks for a French Poodle
    public void doTricks()
    {
        System.out.println( "The French Poodle sat up!" );
        System.out.println( "The French Poodle is lying down!" );
        System.out.println( "The French Poodle shook your hand!" );
    }
    
    // Below is the makeSound method which when called upon will print the sound made by a French Poodle's bark        
    public String makeSound()
    {
        return "Bonjour mon ami";
    }
}