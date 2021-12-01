
/**
 * Class Ghost  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Ghost extends Skeleton
{
    //Variables

    public Ghost(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(80,100,10,35,50,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 8);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 7);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
    
    public void incorporial()
    {
        //Immune To Physical Attacks
    }
}
