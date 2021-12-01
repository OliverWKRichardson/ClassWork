
/**
 * Class Dragon 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Dragon extends Drake
{
    //Instantiate Variables
    
    public Dragon(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(8000,2500,250,100,500,0,setLevel);
        FireResistance = 10;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 800);
        Mana = initialMana + (Level * 250);
        Strength = initialStrength + (Level * 50);
        Dexterity = initialDexterity + (Level * 20);
        Intelligence = initialIntelligence + (Level * 100);
        Faith = initialFaith;
    }
    
    public void dragonFear()
    {
        //Causes High level fear in nearby enemies
    }
}
