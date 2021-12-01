
/**
 * Class Skeletal Dragon 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class SkeletalDragon extends ChimericSkeleton
{
    //Variables

    public SkeletalDragon(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,800,100,40,500,0,setLevel);
        FireResistance = -4;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 80);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 100);
        Faith = initialFaith;
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
    
    public void lesserDragonBreath()
    {
        //Deal High Fire Damage
    }
}
