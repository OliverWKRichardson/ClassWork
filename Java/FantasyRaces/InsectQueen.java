
/**
 * Class Insect Queen 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class InsectQueen extends HiveMind
{
    //Instantiate Variables

    public InsectQueen(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,500,50,250,100,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 50);
        Intelligence = initialIntelligence + (Level * 20);
        Faith = initialFaith;
    }
    
    public void despairAura()
    {
        //Causes mid level fear in nearby enemies
    }
}
