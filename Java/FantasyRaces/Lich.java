
/**
 * Class Lich   
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Lich extends Skeleton
{
    //Variables

    public Lich(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(800,2000,25,40,1000,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 200);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 100);
        Faith = initialFaith;
    }
    
    public void manaOverload()
    {
        //As a result of being undead the undead body can handle being overloaded with mana and 
        //thus mana can be store beyond cap if absorbed from an external source. Mana 
        //regeneration still stops at the cap
    }
    
    public void knowledgeFromBeyondDeath()
    {
        //Grates instant access to High level magic spells
    }
}
