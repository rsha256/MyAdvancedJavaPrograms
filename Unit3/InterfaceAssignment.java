import java.util.Random;

public class InterfaceAssignment
{
    public static void main( String [] args )
    {
        // Below I instantiate a random number generator object, which I reference throughout the program through 'r'  
        Random r = new Random();
        
        // Below I created an array of type Animals called animalArray
        Animals[] animalArray = new Animals[4];

	// Below I define animalArray with objects of class Robins, Bluebirds, Chihuahuas, and FrenchPoodles respectively
        animalArray[0] = new Robins();
        animalArray[1] = new Bluebirds();
        animalArray[2] = new Chihuahuas();
        animalArray[3] = new FrenchPoodles();

        // Below I insert a line feed for neatness                        
        System.out.println();
        
        // Below I use the Random object 'r' to generate a random integer which is used as a subset of animalArray which has its 'makeSound' method invoked
        System.out.println( animalArray[ r.nextInt( animalArray.length ) ].makeSound() );
        System.out.println( animalArray[ r.nextInt( animalArray.length ) ].makeSound() );
        System.out.println( animalArray[ r.nextInt( animalArray.length ) ].makeSound() );
        System.out.println( animalArray[ r.nextInt( animalArray.length ) ].makeSound() );
            
    }
}