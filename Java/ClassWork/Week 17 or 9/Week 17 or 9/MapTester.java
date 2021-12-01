import java.util.HashMap;

/**
 * Class MapTester
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class MapTester
{
    //Instantiate Variables
    HashMap<String, String> phoneBook;

    public MapTester()
    {
        phoneBook = new HashMap<String, String>();
    }

    public void enterNumber(String name, String number)
    {
        phoneBook.put(name, number);        
    }

    public String lookupNumber(String name)
    {
        return phoneBook.get(name);
    }

    public void allKeys()
    {
        for (String key : phoneBook.keySet()) 
        {
            System.out.println(key);
        }
    }

    public String allNames(String number)
    {
        String returnString = "";
        for (String key : phoneBook.keySet()) 
        {
            if(phoneBook.get(key).equals(number))
            {
                if(returnString.equals(""))
                {
                    returnString = key;
                }
                else
                {
                    returnString = returnString + ":" + key;
                }
            }
        }
        return returnString;
    }
}