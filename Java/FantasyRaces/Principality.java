
/**
 * Class Principality  
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Principality extends Valor
{
    //Instantiate Variables

    public Principality(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,1000,75,75,75,1500,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 400);
        Mana = initialMana + (Level * 200);
        Strength = initialStrength + (Level * 30);
        Dexterity = initialDexterity + (Level * 30);
        Intelligence = initialIntelligence + (Level * 30);
        Faith = initialFaith + (Level * 600);
    }
    
    public void highHolyMagic()
    {
        //Grants Access To High Tier Holy Spells
    }
    
    public void hopeAura()
    {
        //Causes Insiration in nearby Allies
    }
}
