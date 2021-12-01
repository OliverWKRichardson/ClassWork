
/**
 * Class Draconian
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Draconian extends HybridRace
{
    //Variables

    public Draconian(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(750,250,75,20,45,0,setLevel);
        FireResistance = 10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 75);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 15);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 9);
        Faith = initialFaith;
    }
    
    public void lesserInferiorDragonBreath()
    {
        //Deal Low Fire Damage
    }
}
