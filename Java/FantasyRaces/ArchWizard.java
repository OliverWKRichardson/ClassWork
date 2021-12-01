
/**
 * Class Arch-Wizard
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class ArchWizard extends Wizard
{
    //Variables

    public ArchWizard(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(300,750,20,30,75,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 75);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void manaCircuitMeditation()
    {
        //Regenerate Mana At An Enhanced Rate
    }
}
