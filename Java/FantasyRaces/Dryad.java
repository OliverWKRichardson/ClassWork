
/**
 * Class Dryad 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Dryad extends Spirit
{
    //Instantiate Variables

    public Dryad(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(800,800,40,60,120,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 80);
        Mana = initialMana + (Level * 80);
        Strength = initialStrength + (Level * 8);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 24);
        Faith = initialFaith;
    }
    
    public void fourElementsMagic()
    {
        //Grants Access To All Four Elements Spells
    }
    
    public void leyLineTeleportation()
    {
        //Allows User To Teleport Using Leylines
    }
}
