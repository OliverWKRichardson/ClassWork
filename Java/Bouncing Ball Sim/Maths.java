
/**
 * Mathematical Functions
 *
 * @author Oliver Richardson
 * @version 5/10/21
 */
public class Maths
{
    public Maths()
    {
        
    }

    static double truncateNumber(double n, int decimalplace)   {   
        //moves the decimal to the right   
        n = n* Math.pow(10, decimalplace);   
        //determines the floor value  
        n = Math.floor(n);   
        //dividing the floor value by 10 to the power decimalplace  
        n = n / Math.pow(10, decimalplace);  
        return n;
    }
}
