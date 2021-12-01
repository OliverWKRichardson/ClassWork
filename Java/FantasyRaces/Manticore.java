
/**
 * Class Manticore 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Manticore extends Beast
{
    //Instantiate Variables
    
    public Manticore(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(1000,500,40,30,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 100);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void irregularProfile()
    {
        //Cannot Wear Armor Or Use Weapons
    }
}
