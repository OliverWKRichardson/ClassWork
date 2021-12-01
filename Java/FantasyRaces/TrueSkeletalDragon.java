
/**
 * Class True Skeletal Dragon   
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class TrueSkeletalDragon extends SkeletalDragon
{
    //Variables

    public TrueSkeletalDragon(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(3500,1500,150,60,1200,0,setLevel);
        FireResistance = 2;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 350);
        Mana = initialMana + (Level * 150);
        Strength = initialStrength + (Level * 30);
        Dexterity = initialDexterity + (Level * 12);
        Intelligence = initialIntelligence + (Level * 240);
        Faith = initialFaith;
    }
    
    public void fadedDragonFear()
    {
        //Causes mid-High level fear in nearby enemies
    }
    
    public void DragonBreath()
    {
        //Deal High Fire Damage and low level light damage
    }
}
