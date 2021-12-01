
/**
 * Class Unicorn 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Unicorn extends Spiritual
{
    //Instantiate Variables

    public Unicorn(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(100,150,25,40,15,20,setLevel);
        HolyResistance = 8;
        EvilResistance = -8;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith + (Level * 4);
    }
    
    public void lowHolyMagic()
    {
        //Grants Access To Low Tier Holy Spells
    }
    
    public void lackingThumbs()
    {
        //Cannot Use Weapons
    }
    
    public void unicornCharge()
    {
        //Charge Forward dealing damage
    }
}
