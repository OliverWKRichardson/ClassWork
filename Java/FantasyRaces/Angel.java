
/**
 * Class Angel 
 *
 * @author Oliver Ricardson
 * @version 0.0
 */
public class Angel extends Divine
{
    //Instantiate Variables

    public Angel(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(100,50,10,10,10,100,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 20);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 4);
        Dexterity = initialDexterity + (Level * 4);
        Intelligence = initialIntelligence + (Level * 4);
        Faith = initialFaith + (Level * 40);
    }
    
    public void lowHolyMagic()
    {
        //Grants Access To Low Tier Holy Spells
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
}
