
/**
 * Class Mother Slime 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class MotherSlime extends GiantSlime
{
    //Instantiate Variables

    public MotherSlime(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(500,600,15,40,50,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 50);
        Mana = initialMana + (Level * 60);
        Strength = initialStrength + (Level * 3);
        Dexterity = initialDexterity + (Level * 8);
        Intelligence = initialIntelligence + (Level * 10);
        Faith = initialFaith;
    }
    
    public void createSpawn()
    {
        //Creates A Regular Slime That Will Follow Basic 
        //Commmands
    }
}
