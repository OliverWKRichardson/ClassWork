
/**
 * Class Giant Skeleton  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantSkeleton extends Skeleton
{
    //Variables

    public GiantSkeleton(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(200,0,40,20,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 20);
        Mana = initialMana;
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
    
    public void thickBones()
    {
        //Slightly resistant To Blunt Damage
    }
}
