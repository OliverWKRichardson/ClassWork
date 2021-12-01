
/**
 * Abstract class Hybrid Race
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public abstract class HybridRace extends Human
{
    //Variables

    public HybridRace(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(150,150,15,15,15,0,setLevel);
    }
    
    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
}
