
/**
 * Class Transcendent Human
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class TranscendentHuman extends Human
{
    //Variables

    public TranscendentHuman(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(100,100,10,10,10,0,setLevel);
        FireResistance = 2;
        WaterResistance = 2;
        EarthResistance = 2;
        AirResistance = 2;
        HolyResistance = 2;
        EvilResistance = 2;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
}
