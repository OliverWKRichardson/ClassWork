
/**
 * Class Great Bear 
 *
 * @author Oliver Richardon
 * @version 0.0
 */
public class GreatBear extends Direwolf
{
    //Instantiate Variables
    
    public GreatBear(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1500,80,80,20,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 150);
        Mana = initialMana + (Level * 6);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void thickHide()
    {
        //Resistant To Physical Damage
    }
}
