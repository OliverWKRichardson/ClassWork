
/**
 * Class Mana Wyrm 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class ManaWyrm extends Spiritual
{
    //Instantiate Variables

    public ManaWyrm(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(80,500,20,75,100,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 8);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
    
    public void manaDrain()
    {
        //Drains Mana From Surrounding Creatures
    }
}
