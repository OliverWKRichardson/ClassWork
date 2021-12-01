
/**
 * Class Lord Of Shadow
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class LordOfShadow extends Assassin
{
    //Variables

    public LordOfShadow(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,800,40,80,40,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 80);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith;
    }
    
    public void vanishingBlow()
    {
        //An Attack That Turns The Caster Invisible 
        //For A Short Time After Landing And Lasts Longer 
        //When Deals A Finishing Blow
    }
}
