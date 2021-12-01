
/**
 * Class Salamander 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Salamander extends Griffon
{
    //Instantiate Variables
    
    public Salamander(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(4000,250,125,50,100,0,setLevel);
        FireResistance = 6;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 400);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 25);
        Dexterity = initialDexterity + (Level * 10);
        Intelligence = initialIntelligence+ (Level * 20);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
