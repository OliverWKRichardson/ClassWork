
/**
 * Class Chimeric Skeleton  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class ChimericSkeleton extends GiantSkeleton
{
    //Variables

    public ChimericSkeleton(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(800,300,80,25,150,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level * 15);
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
    
    public void tailSweep()
    {
        //Large range AOE physical attack
    }
}
