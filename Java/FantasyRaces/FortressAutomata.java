
/**
 * Class Fortress Automata 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class FortressAutomata extends Golem
{
    //Instantiate Variables

    public FortressAutomata(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(3000,0,80,20,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 300);
        Mana = initialMana;
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
    
    public void irregularProfile()
    {
        //Cannot Wear Armor Or Use Weapons
    }
}
