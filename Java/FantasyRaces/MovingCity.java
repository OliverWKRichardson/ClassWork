
/**
 * Class Moving City  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class MovingCity extends FortressAutomata
{
    //Instantiate Variables

    public MovingCity(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(6000,0,150,25,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 600);
        Mana = initialMana;
        Strength = initialStrength + (Level * 30);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
