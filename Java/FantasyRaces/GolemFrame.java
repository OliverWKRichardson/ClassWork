
/**
 * Class Golem Frame  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GolemFrame extends MagicalLifeForm
{
    //Instantiate Variables

    public GolemFrame(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(200,0,30,15,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 20);
        Mana = initialMana;
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 3);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void soulless()
    {
        //Grants Immunity To Mind And Soul Spells But 
        //Reduces Intelligence
    }
}
