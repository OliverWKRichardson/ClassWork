
/**
 * Class Primordial Elemental 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class PrimordialElemental extends HighElemental
{
    //Instantiate Variables

    public PrimordialElemental(String setName,int setLevel,String setElement)
    {
        //Init
        super(setName,setLevel,setElement);
        setResistances();
        setStats(3000,1500,80,160,300,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 300);
        Mana = initialMana + (Level * 150);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 32);
        Intelligence = initialIntelligence + (Level * 60);
        Faith = initialFaith;
    }
    
    public void elementalDomain()//element
    {
        //Converts Surrounding Area To Match The Given Element
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
}
