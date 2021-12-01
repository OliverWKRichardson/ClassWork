
/**
 * Class Spirit 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Spirit extends Spiritual
{
    //Instantiate Variables

    public Spirit(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(75,150,10,75,50,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 8);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith;
    }
    
    public void levitation()
    {
        //Allows User To Float
    }
}
