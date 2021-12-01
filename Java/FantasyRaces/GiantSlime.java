
/**
 * Class Giant Slime   
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantSlime extends Slime
{
    //Instantiate Variables

    public GiantSlime(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(350,50,5,30,3,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 35);
        Mana = initialMana + (Level * 5);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
}
