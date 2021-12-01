
/**
 * Class Hundred Handed One
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class HundredHandedOne extends Giant
{
    //Variables

    public HundredHandedOne(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(1200,200,120,30,15,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 120);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 24);
        Dexterity = initialDexterity + (Level * 6);
        Intelligence = initialIntelligence + (Level * 3);
        Faith = initialFaith;
    }
    
    public void semiDivinity()
    {
        //Immune To Mental Attacks And Partally Immune To 
        //Physical Attacks
    }
}
