
/**
 * Class Constellation
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class Constellation extends TrueHero
{
    //Variables

    public Constellation(String setName,int setLevel)
    {
        //Init
        super(setName,setLevel);
        setResistances();
        setStats(2500,3000,180,120,140,0,setLevel);
        HolyResistance = 10;
        EvilResistance = -8;
    }

    public void setStats(int initialHealth,int initialMana,int initialStrength,int initialDexterity,int initialIntelligence,int initialFaith, int Level)
    {
        Health = initialHealth + (Level * 250);
        Mana = initialMana + (Level * 300);
        Strength = initialStrength + (Level * 36);
        Dexterity = initialDexterity + (Level * 24);
        Intelligence = initialIntelligence + (Level * 28);
        Faith = initialFaith;
    }
    
    public void divinityExpansion()
    {
        //Create An Area Around The Caster 
        //That Buffs Allies And Debuffs Enemies
    }
    
    public void fearAura()
    {
        //Causes low level fear in nearby enemies
    }
    
    public void hopeAura()
    {
        //Causes Inspiration in nearby Allies
    }
}
