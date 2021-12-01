
/**
 * Class DracoNewt 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class DragoNewt extends Merman
{
    //Instantiate Variables

    public DragoNewt(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(450,300,75,60,30,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 45);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith;
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
}
