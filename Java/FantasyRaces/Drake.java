
/**
 * Class Drake 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Drake extends Wyvern
{
    //Instantiate Variables
    
    public Drake(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(4000,1000,150,80,100,0,setLevel);
        FireResistance = 5;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 400);
        Mana = initialMana + (Level * 100);
        Strength = initialStrength + (Level * 30);
        Dexterity = initialDexterity + (Level * 16);
        Intelligence = initialIntelligence + (Level * 20);
        Faith = initialFaith;
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
}
