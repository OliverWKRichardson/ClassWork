
/**
 * Class Compassion 
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Compassion extends Angel
{
    //Instantiate Variables

    public Compassion(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,100,15,15,15,250,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith + (Level * 100);
    }
}
