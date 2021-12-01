
/**
 * Class Celestial 
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Celestial extends Principality
{
    //Instantiate Variables

    public Celestial(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(5000,2000,80,80,100,2000,setLevel);
        HolyResistance = 12;
        EvilResistance = -8;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 1000);
        Mana = initialMana + (Level * 400);
        Strength = initialStrength + (Level * 32);
        Dexterity = initialDexterity + (Level * 32);
        Intelligence = initialIntelligence + (Level * 40);
        Faith = initialFaith + (Level * 800);
    }
    
    public void divineMagic()
    {
        //Grants Access To Divine Spells
    }
    
    public void holyAura()
    {
        //heals nearby Allies
    }
}
