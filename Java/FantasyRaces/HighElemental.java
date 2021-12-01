
/**
 * Class High Elemental 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class HighElemental extends Elemental
{
    //Instantiate Variables

    public HighElemental(String setName,int setLevel,String setElement)
    {
        //Init
        super(setName,setLevel,setElement);
        setResistances();
        setStats(800,500,40,80,150,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 30);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
