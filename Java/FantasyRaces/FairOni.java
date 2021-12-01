
/**
 * Class Fair Oni
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class FairOni extends Oni
{
    //Variables

    public FairOni(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(750,500,60,80,50,700,setLevel);
        HolyResistance = 10;
        EvilResistance = -8;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 75);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith + (Level * 70);
    }
    
    public void holyFlameWall()
    {
        //Creates A Wall Of White Flame That Deals Fire And 
        //Holy Damage
    }
}
