
/**
 * Abstract class Insectiod
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public abstract class Insectiod extends Race
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
        WaterResistance = -2;
        EarthResistance = 10;
        AirResistance = 5;
        HolyResistance = 0;
        EvilResistance = 0;
        //Net Total 5
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
