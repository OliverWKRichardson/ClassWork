
/**
 * Class Behemoth  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Behemoth extends Balrog
{
    //Instantiate Variables

    public Behemoth(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,250,120,30,25,-800,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 24);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith - (Level * 16);
    }
    
    public void fearAura()
    {
        //Causes low level fear in nearby enemies
    }
}
