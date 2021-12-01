
/**
 * Class Naga 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Naga extends Lamia
{
    //Instantiate Variables

    public Naga(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,150,40,80,25,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
}
