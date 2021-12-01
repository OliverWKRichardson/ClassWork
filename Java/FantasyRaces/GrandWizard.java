
/**
 * Class Grand Wizard
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GrandWizard extends ArchWizard
{
    //Instantiate Variables

    public GrandWizard(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,1250,30,45,125,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 125);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void greaterManaCircuit()
    {
        //Greater Enhancement To All Spells
    }
}