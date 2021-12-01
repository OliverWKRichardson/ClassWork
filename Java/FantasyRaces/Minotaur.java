
/**
 * Class Minotaur 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Minotaur extends Lycanthrope
{
    //Instantiate Variables

    public Minotaur(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,250,80,45,16,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 9);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
