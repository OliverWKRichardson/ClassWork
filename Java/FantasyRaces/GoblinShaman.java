
/**
 * Class Goblin Shaman
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GoblinShaman extends Goblin
{
    //Variables

    public GoblinShaman(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(200,100,18,20,25,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
}
