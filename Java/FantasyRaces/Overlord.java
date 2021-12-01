
/**
 * Class Overlord   
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Overlord extends UndeadKing
{
    //Variables

    public Overlord(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2400,6000,50,80,4000,0,setLevel);
        FireResistance = 5;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 240);
        Mana = initialMana + (Level * 600);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 800);
        Faith = initialFaith;
    }
    
    public void touchOfUndeath()
    {
        //Has chance to inflict instant death on target chance scales with Intelligence and 
        //decreases based on target's health
    }
}
