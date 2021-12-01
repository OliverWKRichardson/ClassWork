
/**
 * Class True Hero
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class TrueHero extends Hero
{
    //Variables

    public TrueHero(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,1000,100,75,60,0,setLevel);
        HolyResistance = 6;
        EvilResistance = -6;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 100);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 15);
        Intelligence = initialIntelligence + (Level * 12);
        Faith = initialFaith;
    }
    
    public void trueHolySmite()
    {
        //Deal High Holy Damage
    }
}
