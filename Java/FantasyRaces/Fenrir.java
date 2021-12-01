
/**
 * Class Fenrir  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Fenrir extends FenrisWolf
{
    //Instantiate Variables

    public Fenrir(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(6000,800,200,80,100,-1000,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 600);
        Mana = initialMana + (Level * 80);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith - (Level * 10);
    }
    
    public void LesserDragonBreath()
    {
        //Deal Intermediate Fire Damage
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
    
    public void fearAura()
    {
        //Causes low level fear in nearby enemies
    }
}
