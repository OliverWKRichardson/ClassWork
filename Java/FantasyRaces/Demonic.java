
/**
 * Abstract class Demonic
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public abstract class Demonic extends Race
{
    int FireResistance;
    int WaterResistance;
    int EarthResistance;
    int AirResistance;
    int HolyResistance;
    int EvilResistance;

    public void setResistances()
    {
        //10 max -10 min
        FireResistance = 8;
        WaterResistance = 0;
        EarthResistance = 0;
        AirResistance = 0;
        HolyResistance = -10;
        EvilResistance = 10;
        //Net Total 8
    }
    
    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith)
    {
        Health = initialHealth;
        Mana = initialMana;
        Strength = initialStrength;
        Dexterity = initialDexterity;
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
