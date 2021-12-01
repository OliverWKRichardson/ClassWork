
/**
 * Class Harpy  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Harpy extends Beastman
{
    //Instantiate Variables

    public Harpy(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(140,50,25,45,8,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 14);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 9);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
}
