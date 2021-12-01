
/**
 * Class Griffon 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Griffon extends Manticore
{
    //Instantiate Variables
    
    public Griffon(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(3000,100,100,30,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 300);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
