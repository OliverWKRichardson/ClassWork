
/**
 * Class Centaur 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Centaur extends Beastman
{
    //Instantiate Variables

    public Centaur(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(300,150,30,70,15,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 15);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 14);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith;
    }
}
