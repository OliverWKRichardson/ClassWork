
/**
 * Class Death Knight    
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class DeathKnight extends UndeadSquire
{
    //Variables

    public DeathKnight(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(600,75,80,30,25,0,setLevel);
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 60);
        Mana = initialMana + (Level * 7);
        Strength = initialStrength + (Level * 16);
        Dexterity = initialDexterity + (Level * 5);
        Intelligence = initialIntelligence + (Level * 5);
        Faith = initialFaith;
    }
    
    public void massive()
    {
        //Resistant To Knockback Effects
    }
    
    public void summonUndeadSquire()
    {
        //Summons an undead squire
    }
    
    public void undeathBurst()
    {
        //Deals Necrotic damage to all nearby enemies
    }
}
