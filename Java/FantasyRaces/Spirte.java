
/**
 * Class Spirte 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Spirte extends Spiritual
{
    //Instantiate Variables

    public Spirte(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(25,250,1,45,50,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 3);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level / 10);
        Dexterity = initialDexterity + (Level * 9);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith;
    }
    
    public void highSpeedFlight()
    {
        //Allows User To Fly At High Speed
    }
    
    public void semiIntangible()
    {
        //Reduces All Physical Damage
    }
}
