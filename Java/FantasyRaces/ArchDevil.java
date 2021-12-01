
/**
 * Class ArchDevil 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class ArchDevil extends Devil
{
    //Instantiate Variables

    public ArchDevil(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(800,1500,50,100,240,-700,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 150);
        Strength = initialStrength + (Level * 10);
        Dexterity = initialDexterity + (Level * 20);
        Intelligence = initialIntelligence + (Level * 48);
        Faith = initialFaith - (Level * 14);
    }
}
