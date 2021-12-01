
/**
 * Class Devil 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Devil extends MindFlayer
{
    //Instantiate Variables

    public Devil(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(400,1200,40,75,200,-600,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 40);
        Mana = initialMana + (Level * 120);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 15);
        Intelligence = initialIntelligence + (Level * 40);
        Faith = initialFaith - (Level * 12);
    }
}
