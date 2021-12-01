
/**
 * Class Phoenix 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Phoenix extends Salamander
{
    //Instantiate Variables
    
    public Phoenix(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(5000,500,150,80,250,0,setLevel);
        FireResistance = 8;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 500);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 30);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence+ (Level * 50);
        Faith = initialFaith;
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
    
    public void despairAura()
    {
        //Causes mid level fear in nearby enemies
    }
}
