
/**
 * Class Elemental 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Elemental extends Spirit
{
    //Instantiate Variables
    String Element;

    public Elemental(String setName,int setLevel,String setElement)
    {
        //Init
        super(setName,setLevel);
        Element = setElement;
        setResistances();
        setStats(500,250,25,60,100,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 20);
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
    
    public void elementalAffinity()//element
    {
        //Grains Immunity To The Specified Element As Well 
        //As All Spells Of That Element
    }
}
