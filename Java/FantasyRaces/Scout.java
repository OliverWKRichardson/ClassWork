
/**
 * Class Scout
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Scout extends TranscendentHuman
{
    //Variables

    public Scout(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(120,180,15,25,15,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 12);
        Mana = initialMana + (Level * 18);
        Strength = initialStrength + (Level * 1);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence + (Level * 1);
        Faith = initialFaith;
    }
}
