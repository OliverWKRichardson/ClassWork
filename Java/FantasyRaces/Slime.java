
/**
 * Class Slime  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Slime extends MagicalLifeForm
{
    //Instantiate Variables

    public Slime(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(40,50,5,25,1,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 4);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level / 5);
        Faith = initialFaith;
    }
    
    public void soulless()
    {
        //Grants Immunity To Mind And Soul Spells But 
        //Reduces Intelligence
    }
    
    public void irregularProfile()
    {
        //Cannot Wear Armor Or Use Weapons
    }
}
