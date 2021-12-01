
/**
 * Class Oni
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Oni extends Ogre
{
    //Variables
    public Oni(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,250,50,25,25,0,setLevel);
        FireResistance = 8;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
    
    public void oniFire()
    {
        //Throws A Oni-Flame Fireball
    }
}
