
/**
 * Class Lizardman
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Lizardman extends Beastman
{
    //Instantiate Variables

    public Lizardman(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(200,100,50,20,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 20);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
}
