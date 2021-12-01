
/**
 * Class Mind Flayer 
 *
 * @author Oliver Richardson   
 * @version 0.0
 */
public class MindFlayer extends Demon
{
    //Instantiate Variables

    public MindFlayer(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,850,30,30,80,-500,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 85);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 16);
        Faith = initialFaith - (Level * 8);
    }
}
