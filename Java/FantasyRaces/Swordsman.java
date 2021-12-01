
/**
 * Class Swordsman
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Swordsman extends TranscendentHuman
{
    //Variables

    public Swordsman(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,100,25,15,10,0,setLevel);
        FireResistance = 2;
        WaterResistance = 2;
        EarthResistance = 2;
        AirResistance = 2;
        HolyResistance = 2;
        EvilResistance = 2;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
}
