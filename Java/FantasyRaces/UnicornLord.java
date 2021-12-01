
/**
 * Class Unicorn Lord 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class UnicornLord extends Unicorn
{
    //Instantiate Variables

    public UnicornLord(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,250,40,60,25,40,setLevel);
        HolyResistance = 10;
        EvilResistance = -10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith + (Level * 8);
    }
}
