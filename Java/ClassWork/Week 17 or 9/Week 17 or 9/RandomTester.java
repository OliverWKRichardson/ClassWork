import java.util.Random;

/**
 * Class RandomTester
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class RandomTester
{
    //Instantiate Variables
    Random rand = new Random();
    
    public RandomTester()
    {
        //Init
    }

    public int throwDie()
    {
        int returnNum = rand.nextInt(6);
        return returnNum + 1;
    }
}