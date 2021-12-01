
/**
 * Class Troll
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Troll extends Orc
{
    //Variables

    public Troll(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(300,200,35,16,20,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 7);
        Dexterity = initialDexterity + (Level * 3);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void enhancedNaturalRegeneration()
    {
        //Heal Naturally Faster
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
