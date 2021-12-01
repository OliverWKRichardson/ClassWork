
/**
 * Class Elf
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Elf extends Humaniod
{
    //Variables

    public Elf(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(100,100,15,35,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 3);
        Dexterity = initialDexterity + (Level * 7);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
}
