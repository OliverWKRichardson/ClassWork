
/**
 * Class Giant Hornet 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class GiantHornet extends Insectiod
{
    //Instantiate Variables

    public GiantHornet(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(300,100,15,75,10,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 30);
        Mana = initialMana + (Level * 10);
        Strength = initialStrength + (Level * 3);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 2);
        Faith = initialFaith;
    }
    
    public void irregularProfile()
    {
        //Cannot Wear Armor Or Use Weapons
    }
    
    public void flight()
    {
        //Allows User To Fly
    }
}
