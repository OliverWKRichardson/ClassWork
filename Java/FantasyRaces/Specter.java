
/**
 * Class Specter    
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Specter extends Ghost
{
    //Variables

    public Specter(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(120,300,12,40,250,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 12);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 50);
        Faith = initialFaith;
    }
    
    public void flicker()
    {
        //Turn invisable briefly and gain double move speed for that duration
    }
}
