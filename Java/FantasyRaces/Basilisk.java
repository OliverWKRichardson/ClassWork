
/**
 * Class Basilisk 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Basilisk extends Griffon
{
    //Instantiate Variables
    
    public Basilisk(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2500,1000,60,40,80,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 250);
        Mana = initialMana + (Level * 100);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 16);
        Faith = initialFaith;
    }
    
    public void petrifyingGaze()
    {
        //Whilst in the vison of the caster slowly reduces dexterity and move speed untill both 
        //hit 0 at which point the target dies
    }
}
