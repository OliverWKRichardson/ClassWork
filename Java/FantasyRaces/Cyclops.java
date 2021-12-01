
/**
 * Class Cyclops
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Cyclops extends Orc
{
    //Variables

    public Cyclops(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,150,50,20,12,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
