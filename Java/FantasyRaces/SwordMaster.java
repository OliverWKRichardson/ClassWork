
/**
 * Class Sword Master
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class SwordMaster extends Swordsman
{
    //Variables

    public SwordMaster(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(750,300,75,30,20,0,setLevel);
        FireResistance = 3;
        WaterResistance = 3;
        EarthResistance = 3;
        AirResistance = 3;
        HolyResistance = 3;
        EvilResistance = 3;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 75);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void manaBlade()
    {
        //Provides A Buff To Attacks With Bladed 
        //Weapons With Mana
    }
}
