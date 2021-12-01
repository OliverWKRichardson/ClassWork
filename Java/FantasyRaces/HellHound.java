
/**
 * Class Hell Hound 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class HellHound extends Demonic
{
    //Instantiate Variables

    public HellHound(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(200,50,45,60,15,-150,setLevel);
        FireResistance = 10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 20);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 9);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith - (Level * 3);
    }
    
    public void lackingThumbs()
    {
        //Cannot Use Weapons
    }
}
