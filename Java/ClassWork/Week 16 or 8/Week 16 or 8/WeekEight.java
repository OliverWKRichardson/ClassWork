
/**
 * Class WeekEight
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class WeekEight
{
    //Instantiate Variables

    public WeekEight()
    {
        //Init
    }

    public int sum(int a, int b)
    {
        int smaller = a;
        int larger = b;
        int total = 0;
        while(smaller<=larger)
        {
            total += smaller;
            smaller++;
        }
        return total;
    }
}