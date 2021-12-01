
/**
 * Class Fire Bear 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class FireBear extends GreatBear
{
    //Instantiate Variables
    
    public FireBear(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,300,100,25,5,0,setLevel);
        FireResistance = 10;
        WaterResistance = -10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
    
    public void flameAura()
    {
        //Deals Fire Damage to nearby enemies
    }
}
