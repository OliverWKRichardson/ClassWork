
/**
 * Class Giant Worm 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantWorm extends GiantMantis
{
    //Instantiate Variables

    public GiantWorm(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,200,100,50,20,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 10);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void tunneling()
    {
        //Allows The User To Tunnel Underground
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
}
