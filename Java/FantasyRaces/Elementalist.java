
/**
 * Class Elementalist
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Elementalist extends HybridRace
{
    //Variables

    public Elementalist(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,750,25,35,75,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 75);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 7);
        Intelligence = initialIntelligence + (Level * 15);
        Faith = initialFaith;
    }
    
    public void summonContract()
    {
        //Create A Contract With A Spirit
    }
}
