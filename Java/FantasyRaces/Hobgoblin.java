
/**
 * Class Hobgoblin
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Hobgoblin extends GoblinWarrior
{
    //Variables

    public Hobgoblin(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(450,0,40,18,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 45);
        Mana = initialMana;
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
