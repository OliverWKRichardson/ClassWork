
/**
 * Class Ouroboros 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Ouroboros extends Leviathan
{
    //Instantiate Variables

    public Ouroboros(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,600,120,180,75,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 60);
        Strength = initialStrength + (Level * 24);
        Dexterity = initialDexterity + (Level * 36);
        Intelligence = initialIntelligence + (Level * 15);
        Faith = initialFaith;
    }
    
    public void despairAura()
    {
        //Causes mid level fear in nearby enemies
    }
}
