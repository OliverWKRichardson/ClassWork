
/**
 * Class Ant-Lion 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class AntLion extends GiantAnt
{
    //Instantiate Variables

    public AntLion(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1000,10,80,40,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 100);
        Mana = initialMana + (Level * 1);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
}
