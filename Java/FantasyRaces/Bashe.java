
/**
 * Class Bashe
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Bashe extends Naga
{
    //Instantiate Variables

    public Bashe(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,200,60,85,30,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 20);
        Strength = initialStrength + (Level * 12);
        Dexterity = initialDexterity + (Level * 17);
        Intelligence = initialIntelligence + (Level * 6);
        Faith = initialFaith;
    }
    
    public void gargantuan()
    {
        //Immune To Knockback Effects
    }
    
    public void lackingThumbs()
    {
        //Cannot Use Weapons
    }
}
