
/**
 * Class Cockatrice
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Cockatrice extends Basilisk
{
    //Instantiate Variables
    
    public Cockatrice(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(4500,1500,80,30,120,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 450);
        Mana = initialMana + (Level * 150);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 24);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
    
    public void thickHide()
    {
        //Resistant To Physical Damage
    }
}
