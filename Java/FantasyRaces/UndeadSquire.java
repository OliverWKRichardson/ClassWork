
/**
 * Class Undead Squire   
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class UndeadSquire extends Ghoul
{
    //Variables

    public UndeadSquire(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(300,25,45,20,15,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 9);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith;
    }
    
    public void ancientSwordsmanship()
    {
        //A collection of 4 attacks that rotate on each cast
    }
}
