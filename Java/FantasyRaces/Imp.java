
/**
 * Class Imp  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Imp extends Demonic
{
    //Instantiate Variables

    public Imp(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(100,250,15,10,25,-100,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 10);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 3);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith - (Level * 20);
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
}
