
/**
 * Class Curse Mummy
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class CurseMummy extends Ghoul
{
    //Variables

    public CurseMummy(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(175,100,25,20,25,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 17);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
    
    public void curse()
    {
        //Increase Damage that nearby enemies take
    }
    
    public void bindingWraps()
    {
        //Fire a bandage that immobilizes an enemy
    }
}
