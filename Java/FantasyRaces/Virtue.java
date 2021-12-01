
/**
 * Class Virtue  
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Virtue extends Dominion
{
    //Instantiate Variables

    public Virtue(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1000,500,45,45,45,1000,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 100);
        Strength = initialStrength + (Level * 18);
        Dexterity = initialDexterity + (Level * 18);
        Intelligence = initialIntelligence + (Level * 18);
        Faith = initialFaith + (Level * 400);
    }
}
