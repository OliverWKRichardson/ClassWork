
/**
 * Class Giant Dragon Fly 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantDragonFly extends GiantHornet
{
    //Instantiate Variables

    public GiantDragonFly(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(600,200,25,100,15,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 60);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 20);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
}
