
/**
 * Class Lycanthrope  
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Lycanthrope extends Kobold
{
    //Instantiate Variables

    public Lycanthrope(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(300,200,60,30,20,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
}
