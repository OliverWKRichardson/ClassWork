
/**
 * Abstract class Magical Life Form
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public abstract class MagicalLifeForm extends Race
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
        FireResistance = -1;
        WaterResistance = -1;
        EarthResistance = -1;
        AirResistance = -1;
        HolyResistance = 3;
        EvilResistance = 3;
        //Net Total 2
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
