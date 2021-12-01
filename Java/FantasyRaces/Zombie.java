
/**
 * Class Zombie 
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Zombie extends Undead
{
    //Variables

    public Zombie(String setName,int setLevel)
    {
        //Init
        super.Name = setName;
        super.Level = setLevel;
        setResistances();
        setStats(150,0,25,5,0,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 15);
        Mana = initialMana;
        Strength = initialStrength + (Level * 5);
        Dexterity = initialDexterity + (Level * 1);
        Intelligence = initialIntelligence;
        Faith = initialFaith;
    }
    
    public void undeadPhysique()
    {
        //Healed And Empowered By Negative Energy Instead Of 
        //Taking Damage and Immune To Poison and Disease
    }
}
