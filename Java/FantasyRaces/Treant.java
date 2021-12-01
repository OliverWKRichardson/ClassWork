
/**
 * Class Treant 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Treant extends Beast
{
    //Instantiate Variables
    
    public Treant(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(3000,100,60,10,30,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 300);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 2);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith;
    }
    
    public void irregularProfile()
    {
        //Cannot Wear Armor Or Use Weapons
    }
    
    public void takeRoot()
    {
        //Burrow into the ground becoming immobile but gaining constant high health regen
    }
    
    public void acornAssult()
    {
        //Fire an acorn at the target if it hits a target already hit by an acorn it spawns a 
        //small turret that fires seeds at the target whilst in range
    }
}
