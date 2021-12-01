
/**
 * Class Golem 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Golem extends GolemFrame
{
    //Instantiate Variables

    public Golem(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(400,0,40,18,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 40);
        Mana = initialMana;
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
