
/**
 * Abstract class Spiritual
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public abstract class Spiritual extends Race
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
        FireResistance = -8;
        WaterResistance = 8;
        EarthResistance = 5;
        AirResistance = -5;
        HolyResistance = 5;
        EvilResistance = -5;
        //Net Total 0
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
