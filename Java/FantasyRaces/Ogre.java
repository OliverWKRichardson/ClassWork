
/**
 * Class Ogre
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Ogre extends Humaniod
{
    //Variables

    public Ogre(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(200,50,35,15,8,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 20);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 7);
        Dexterity = initialDexterity + (Level * 3);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
}
