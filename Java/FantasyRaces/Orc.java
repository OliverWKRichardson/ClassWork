
/**
 * Class Orc
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Orc extends Humaniod
{
    //Variables

    public Orc(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(250,100,25,12,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
