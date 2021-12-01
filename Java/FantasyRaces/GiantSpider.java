
/**
 * Class Giant Spider 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantSpider extends GiantBeetle
{
    //Instantiate Variables

    public GiantSpider(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2500,500,250,60,50,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 250);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 50);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith;
    }
    
    public void webWeaving()
    {
        //Creates Threads That Can Be Used To Root Opponents
    }
    
    public void wallWalking()
    {
        //Allow The User To Walk On Walls
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
}
