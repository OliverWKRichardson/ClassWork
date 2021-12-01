
/**
 * Class Possessed Armor 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class PossessedArmor extends MagicalLifeForm
{
    //Instantiate Variables

    public PossessedArmor(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(250,100,40,15,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 3);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void soulless()
    {
        //Grants Immunity To Mind And Soul Spells But 
        //Reduces Intelligence
    }
}
