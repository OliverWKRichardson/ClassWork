
/**
 * Class Sword Saint
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class SwordSaint extends SwordMaster
{
    //Variables

    public SwordSaint(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1250,500,125,45,30,0,setLevel);
        FireResistance = 4;
        WaterResistance = 4;
        EarthResistance = 4;
        AirResistance = 4;
        HolyResistance = 4;
        EvilResistance = 4;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 125);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void auraBlade()
    {
        //Provides A Large Buff To Attacks With Bladed 
        //Weapons With Aura
    }
}
