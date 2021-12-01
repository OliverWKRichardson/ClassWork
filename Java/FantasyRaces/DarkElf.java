
/**
 * Class Dark Elf
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class DarkElf extends Elf
{
    //Variables

    public DarkElf(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(150,150,20,40,20,0,setLevel);
        HolyResistance = -5;
        EvilResistance = 5;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void corruptedManaConversion()
    {
        //Converts Corrupted Mana In The Area Into Health 
        //And Mana
    }
}
