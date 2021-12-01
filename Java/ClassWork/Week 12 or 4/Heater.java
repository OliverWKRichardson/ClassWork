
/**
 * Class Heater
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Heater
{
    private double temperature;
    private double increment;
    private double min;
    private double max;

    public Heater(double setTemp, double setMin, double setMax)
    {
        temperature = setTemp;
        increment = 5;
        min = setMin;
        max = setMax;
    }

    public void setIncrement(double newIncrement)
    {
        if(newIncrement > 0)
        {
            increment = newIncrement;
        }
    }
    
    public void warmer()
    {
        if(temperature + increment <= max)
        {
            temperature = temperature + increment;
        }
    }
    
    public void cooler()
    {
        if(temperature - increment >= min)
        {
            temperature = temperature - increment;
        }
    }
}