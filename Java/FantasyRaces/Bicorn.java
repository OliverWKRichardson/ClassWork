
/**
 * Class Bicorn 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Bicorn extends Beast
{
    //Instantiate Variables
    
    public Bicorn(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(600,50,35,15,0,0,setLevel);
    }
    
    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 60);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 7);
        Dexterity = initialDexterity + (Level * 3);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void lackingThumbs()
    {
        //Cannot Use Weapons
    }
    
    public void bicornCharge()
    {
        //Charge Forward impaling any enemies hit and bringing them with the caster
    }
}
