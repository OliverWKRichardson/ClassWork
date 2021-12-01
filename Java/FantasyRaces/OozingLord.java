
/**
 * Class Oozing Lord 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class OozingLord extends GiantSlime
{
    //Instantiate Variables

    public OozingLord(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1000,500,60,35,30,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 100);
        Mana = initialMana + (Level * 50);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 7);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith;
    }
    
    public void toxicTouch()
    {
        //Deals Damage To And Poisons Creatures That Come 
        //Into Contact With The User
    }
}
