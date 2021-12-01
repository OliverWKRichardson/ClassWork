
/**
 * Class Wicked Oni
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class WickedOni extends Oni
{
    //Variables

    public WickedOni(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(750,500,80,60,50,-700,setLevel);
        HolyResistance = -8;
        EvilResistance = 10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 75);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith - (Level * 70);
    }
    
    public void darkFlameWall()
    {
        //Creates A Wall Of Black Flame That Deals Fire And 
        //Evil Damage
    }
}
