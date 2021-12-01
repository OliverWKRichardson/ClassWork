
/**
 * Class Giant Beetle 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantBeetle extends GiantScorpion
{
    //Instantiate Variables

    public GiantBeetle(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,100,150,40,20,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 30);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
