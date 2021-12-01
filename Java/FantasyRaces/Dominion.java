
/**
 * Class Dominion 
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Dominion extends Seraphim
{
    //Instantiate Variables

    public Dominion(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(750,250,45,45,45,750,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 100);
        Strength = initialStrength + (Level * 18);
        Dexterity = initialDexterity + (Level * 18);
        Intelligence = initialIntelligence + (Level * 18);
        Faith = initialFaith + (Level * 300);
    }
    
    public void medHolyMagic()
    {
        //Grants Access To Med Tier Holy Spells
    }
}
