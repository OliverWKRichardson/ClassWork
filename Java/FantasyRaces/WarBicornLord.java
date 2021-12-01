
/**
 * Class War Bicorn Lord 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class WarBicornLord extends WarBicorn
{
    //Instantiate Variables
    
    public WarBicornLord(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2000,600,80,20,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 200);
        Mana = initialMana + (Level * 60);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    } 
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
}
