
/**
 * Class Hero
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Hero extends Saint
{
    //Variables

    public Hero(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1000,750,80,60,45,0,setLevel);
        HolyResistance = 4;
        EvilResistance = -4;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 100);
        Mana = initialMana + (Level * 75);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 9);
        Faith = initialFaith;
    }
    
    public void holySmite()
    {
        //Deal Holy Damage
    }
}
