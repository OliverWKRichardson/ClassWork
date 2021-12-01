
/**
 * Class Demon 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Demon extends Imp
{
    //Instantiate Variables

    public Demon(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,250,35,20,30,-400,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 7);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith - (Level * 6);
    }
}
