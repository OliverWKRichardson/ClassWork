
/**
 * Class Wizard
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Wizard extends TranscendentHuman
{
    //Variables

    public Wizard(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(120,250,10,15,25,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 12);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
    
    public void manaCircuit()
    {
        //Enhancement To All Spells
    }
}
