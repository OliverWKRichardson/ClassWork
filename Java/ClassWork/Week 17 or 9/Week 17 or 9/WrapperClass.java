import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class WrapperClass
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class WrapperClass
{
    //Instantiate Variables
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> integers = new ArrayList<Integer>();
    
    public WrapperClass()
    {
        //Init
    }

    public int scan()
    {
        int input = scanner.nextInt();
        return input;
    }
    
    public void store()
    {
        int input = scan();
        while(input >= 0)
        {
            integers.add(input);
            input = scan();
        }
    }
    
    public void print()
    {
        for(int integer : integers)
        {
            System.out.print(integer);
        }
    }
}