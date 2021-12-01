
/**
 * Class Fenris Wolf 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class FenrisWolf extends Barghest
{
    //Instantiate Variables

    public FenrisWolf(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(400,100,90,80,12,-650,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 40);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith - (Level * 5);
    }
}
