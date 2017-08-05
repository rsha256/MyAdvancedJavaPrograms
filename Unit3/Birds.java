public class Birds implements Animals
{
    // Below is the age method. Because Birds implements Animals and is not abstract it has to override the methods in Animals
    public void age()
    {
        
    }
    
    // Below is the weight method. Because Birds implements Animals and is not abstract it has to override the methods in Animals    
    public void weight()
    {
    
    }
        
    // Below is the makeSound method. This message should be overriden by the respective Birds subclass. If this message is printed you know there's an error here    
    public String makeSound()
    {
        return "This message should have been overridden from Birds";    
    }
    
    // Below is the doTricks(fly) method. Because Birds implements Animals and is not abstract it has to override the methods in Animals    
    public void doTricks()
    {
        
    }
}