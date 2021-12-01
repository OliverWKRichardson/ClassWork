
/**
 * Class Seraphim  
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Seraphim extends Compassion
{
    //Instantiate Variables

    public Seraphim(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,200,30,30,30,500,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 100);
        Mana = initialMana + (Level * 40);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 12);
        Faith = initialFaith + (Level * 200);
    }
}
