/**
 * A Heater Class
 *
 * @author Oliver Richardson
 * @version 13/10/21
 */
public class Heater
{
    private int temperature;

    public Heater(int baseTemperature)
    {
        temperature = baseTemperature;
    }
    //getters
    public int getTemperature()
    {
        return temperature;
    }
    //setters
    public void setTemperature(int newTemperature)
    {
        temperature = newTemperature;
    }
    //printers
    public void printTemperature()
    {
        System.out.println("The temperature is "+temperature+" degrees.");
    }
}
