
/**
 * Class Balrog 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Balrog extends Demon
{
    //Instantiate Variables

    public Balrog(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,200,80,25,20,-600,setLevel);
        FireResistance = 10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith - (Level * 12);
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
}
