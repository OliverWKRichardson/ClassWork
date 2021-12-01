
/**
 * Class Saint
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Saint extends HybridRace
{
    //Variables

    public Saint(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(400,350,40,20,30,0,setLevel);
        HolyResistance = 2;
        EvilResistance = -2;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 40);
        Mana = initialMana + (Level * 35);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith;
    }
    
    public void holyAura()
    {
        //Heal Nearby Allies
    }
}
