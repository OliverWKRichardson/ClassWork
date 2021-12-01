
/**
 * Class Mana Drake 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class ManaDrake extends ManaWyrm
{
    //Instantiate Variables

    public ManaDrake(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(120,1000,30,100,200,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 12);
        Mana = initialMana + (Level * 100);
        Strength = initialStrength + (Level * 6);
        Dexterity = initialDexterity + (Level * 10);
        Intelligence = initialIntelligence + (Level * 20);
        Faith = initialFaith;
    }
    
    public void manaBeam()
    {
        //Shoots A Small Laser Of Mana
    }
}
