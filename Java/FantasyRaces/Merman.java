
/**
 * Class Merman  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Merman extends Lizardman
{
    //Instantiate Variables

    public Merman(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(250,200,60,40,15,0,setLevel);
        WaterResistance = 4;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 25);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith;
    }
    
    public void gills()
    {
        //Allows User To Breath Underwater
    }
}
