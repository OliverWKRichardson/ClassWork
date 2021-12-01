
/**
 * Class Doppelganger  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Doppelganger extends PossessedArmor
{
    //Instantiate Variables

    public Doppelganger(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(300,300,40,35,40,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 7);
        Intelligence = initialIntelligence + (Level * 8);
        Faith = initialFaith;
    }
    
    public void artificalSoul()
    {
        //Couter-Acts The Effects Of Soulless And Grants 
        //Resistance To Mind And Soul Spells
    }
    
    public void duplication()
    {
        //Creates A Clone Of The User With 80% Of Their Stats
        //Only One May Be Active At A Time
    }
    
    public void mimicry()
    {
        //Takes The Appearence And 95% Of The Stats Of The 
        //Target As Well AS All Innate Abilities Temporarily
    }
}
