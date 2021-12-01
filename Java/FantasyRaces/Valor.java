
/**
 * Class Valor 
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Valor extends Virtue
{
    //Instantiate Variables

    public Valor(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,750,50,50,50,1000,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 300);
        Mana = initialMana + (Level * 150);
        Strength = initialStrength + (Level * 20);
        Dexterity = initialDexterity + (Level * 20);
        Intelligence = initialIntelligence + (Level * 20);
        Faith = initialFaith + (Level * 400);
    }
}
