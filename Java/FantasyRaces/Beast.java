
/**
 * Abstract class Beast
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public abstract class Beast extends Race
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
        FireResistance = 2;
        WaterResistance = -2;
        EarthResistance = 2;
        AirResistance = -2;
        HolyResistance = 2;
        EvilResistance = 2;
        //Net Total 4
    }
    
    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth;
        Mana = initialMana;
        Strength = initialStrength;
        Dexterity = initialDexterity;
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
