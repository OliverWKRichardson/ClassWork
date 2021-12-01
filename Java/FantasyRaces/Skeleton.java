
/**
 * Class Skeleton   
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Skeleton extends Zombie
{
    //Variables

    public Skeleton(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(100,0,20,25,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana;
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
    
    public void brittle()
    {
        //take more physical damage from blunt attacks
    }
}
