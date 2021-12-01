
/**
 * Class Wyvern 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Wyvern extends Griffon
{
    //Instantiate Variables
    
    public Wyvern(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,200,80,150,20,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 30);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
}
