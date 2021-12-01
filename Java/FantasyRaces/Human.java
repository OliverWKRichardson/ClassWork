
/**
 * Class Human
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Human extends Humaniod
{
    //Variables

    public Human(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(80,80,10,10,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 8);
        Mana = initialMana + (Level * 8);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
}
