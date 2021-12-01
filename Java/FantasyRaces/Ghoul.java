
/**
 * Class Ghoul
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Ghoul extends Zombie
{
    //Variables

    public Ghoul(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(200,50,30,10,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void rottingFlesh()
    {
        //Inflict Poison on enemies hit with melee attacks
    }
}
