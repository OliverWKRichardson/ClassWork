
/**
 * Class Giant
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Giant extends Orc
{
    //Variables

    public Giant(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(800,50,80,25,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void gigantifaction()
    {
        //Provides A Large Buff To Strength
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
}
