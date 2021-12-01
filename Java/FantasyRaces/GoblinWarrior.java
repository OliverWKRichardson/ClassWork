
/**
 * Class Goblin Warrior
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GoblinWarrior extends Goblin
{
    //Variables

    public GoblinWarrior(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(150,0,25,12,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana;
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
