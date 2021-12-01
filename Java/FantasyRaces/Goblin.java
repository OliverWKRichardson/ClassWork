
/**
 * Class Goblin
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Goblin extends Humaniod
{
    //Instantiate Variables

    public Goblin(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(100,0,15,10,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana;
        Strength = initialStrength + (Level * 3);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
