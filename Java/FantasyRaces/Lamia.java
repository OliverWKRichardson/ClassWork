
/**
 * Class Lamia  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Lamia extends Beastman
{
    //Instantiate Variables

    public Lamia(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(150,100,35,50,20,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 7);
        Dexterity = initialDexterity + (Level * 10);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
}
