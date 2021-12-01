
/**
 * Class Giant Mantis 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantMantis extends GiantAnt
{
    //Instantiate Variables

    public GiantMantis(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(750,150,50,75,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 75);
        Mana = initialMana + (Level * 30);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 15);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
}
