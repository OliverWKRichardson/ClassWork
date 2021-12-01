
/**
 * Class Hive Mind 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class HiveMind extends FlameFly
{
    //Instantiate Variables

    public HiveMind(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1000,300,30,150,80,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 100);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 30);
        Intelligence = initialIntelligence + (Level * 16);
        Faith = initialFaith;
    }
    
    public void shiftingBody()
    {
        //Can Wear Any Armor
    }
    
    public void naturalArmor()
    {
        //Grants Armor That Scales With Level
    }
    
    public void mitosis()
    {
        //Splits User Into Two Entities With Half The Health 
        //Of The Original That When One Is Destroyed Returns
        //To One Being
    }
}
