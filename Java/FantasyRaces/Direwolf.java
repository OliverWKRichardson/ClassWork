
/**
 * Class Direwolf 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Direwolf extends Beast
{
    //Instantiate Variables
    
    public Direwolf(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(500,50,30,60,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void lackingThumbs()
    {
        //Cannot Use Weapons
    }
    
    public void deepBite()
    {
        //Deals Stabbing Damage and Holds The Target
    }
}
