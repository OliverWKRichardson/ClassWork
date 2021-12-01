
/**
 * Class Flame Fly 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class FlameFly extends GiantDragonFly
{
    //Instantiate Variables

    public FlameFly(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(300,500,20,60,150,0,setLevel);
        FireResistance = 5;
        WaterResistance = -5;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 30);
        Faith = initialFaith;
    }
}
