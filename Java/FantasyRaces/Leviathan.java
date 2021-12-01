
/**
 * Class Leviathan 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Leviathan extends Tengshe
{
    //Instantiate Variables

    public Leviathan(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1200,400,100,140,50,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 120);
        Mana = initialMana + (Level * 40);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 28);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith;
    }
    
    public void fearAura()
    {
        //Causes low level fear in nearby enemies
    }
}
