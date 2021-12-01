
/**
 * Class Giant Ant 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantAnt extends Insectiod
{
    //Instantiate Variables

    public GiantAnt(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(600,10,50,30,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 60);
        Mana = initialMana + (Level * 1);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void irregularBody()
    {
        //Cannot Wear Armor
    }
    
    public void naturalArmor()
    {
        //Grants Armor That Scales With Level
    }
}
