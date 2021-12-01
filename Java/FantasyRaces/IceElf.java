
/**
 * Class Ice Elf
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class IceElf extends Elf
{
    //Variables

    public IceElf(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,250,30,50,40,0,setLevel);
        WaterResistance = 8;
        AirResistance = 2;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 10);
        Intelligence = initialIntelligence + (Level * 8);
        Faith = initialFaith;
    }
    
    public void coldImmunity()
    {
        //Immunity To Cold Effects
    }
}
