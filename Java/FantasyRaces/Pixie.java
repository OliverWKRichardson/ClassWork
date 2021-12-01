
/**
 * Class Pixie
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Pixie extends Spirte
{
    //Instantiate Variables

    public Pixie(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(50,300,5,60,80,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 5);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 16);
        Faith = initialFaith;
    }
}
