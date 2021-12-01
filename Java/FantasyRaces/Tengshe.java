
/**
 * Class Tengshe 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Tengshe extends Bashe
{
    //Instantiate Variables

    public Tengshe(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(800,250,80,100,35,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 25);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 20);
        Intelligence = initialIntelligence + (Level * 7);
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
}
