
/**
 * Class Undead King    
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class UndeadKing extends Lich
{
    //Variables

    public UndeadKing(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1200,4000,40,60,2000,0,setLevel);
        FireResistance = 2;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 120);
        Mana = initialMana + (Level * 400);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 200);
        Faith = initialFaith;
    }
    
    public void despairAura()
    {
        //Causes mid level fear in nearby enemies
    }
}
