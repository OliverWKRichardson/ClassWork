
/**
 * Class Wight  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Wraith extends Specter
{
    //Variables

    public Wraith(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(150,800,20,60,400,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana + (Level * 80);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 80);
        Faith = initialFaith;
    }
    
    public void blink()
    {
        //Teleport a short distance
    }
}
