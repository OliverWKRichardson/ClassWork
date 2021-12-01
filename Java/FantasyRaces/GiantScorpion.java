
/**
 * Class Giant Scorpion 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantScorpion extends AntLion
{
    //Instantiate Variables

    public GiantScorpion(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1200,150,100,45,25,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 120);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 9);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
}
