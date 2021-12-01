
/**
 * Class Pestilence 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Pestilence extends InsectQueen
{
    //Instantiate Variables

    public Pestilence(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(4000,800,80,400,200,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 400);
        Mana = initialMana + (Level * 80);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 80);
        Intelligence = initialIntelligence + (Level * 40);
        Faith = initialFaith;
    }
    
    public void plague()
    {
        //Creates A Mist That Can Inflicit Various Effects
    }
}
