
/**
 * Class Dragoniod
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Dragoniod extends Draconian
{
    //Variables

    public Dragoniod(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1250,500,100,45,60,0,setLevel);
        FireResistance = 10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 125);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 9);
        Intelligence = initialIntelligence + (Level * 12);
        Faith = initialFaith;
    }
    
    public void inferiorDragonBreath()
    {
        //Deal Middling Fire Damage
    }
}
