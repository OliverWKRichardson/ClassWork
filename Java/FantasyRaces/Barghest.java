
/**
 * Class Barghest 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Barghest extends HellHound
{
    //Instantiate Variables

    public Barghest(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(200,50,50,80,25,-250,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 40);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith - (Level * 5);
    }
}
