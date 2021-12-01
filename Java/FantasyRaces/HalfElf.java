
/**
 * Class Half-Elf
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class HalfElf extends Elf
{
    //Variables

    public HalfElf(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(100,100,20,30,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
}
