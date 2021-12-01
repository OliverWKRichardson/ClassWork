
/**
 * Class Kobold 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Kobold extends Beastman
{
    //Instantiate Variables

    public Kobold(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(80,0,30,15,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 8);
        Mana = initialMana;
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 3);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
