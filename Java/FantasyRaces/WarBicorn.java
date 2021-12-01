
/**
 * Class War Bicorn 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class WarBicorn extends Bicorn
{
    //Instantiate Variables
    
    public WarBicorn(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,200,60,18,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void irregularProfile()
    {
        //Cannot Wear Armor Or Use Weapons
    }
    
    public void naturalArmor()
    {
        //Grants Armor That Scales With Level
    }
}
