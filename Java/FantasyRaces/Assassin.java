
/**
 * Class Assassin
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Assassin extends Scout
{
    //Variables

    public Assassin(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(400,600,30,50,30,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 40);
        Mana = initialMana + (Level * 60);
        Strength = initialStrength + (Level * 2);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void shortBlink()
    {
        //Short Range Teleport
    }
}
