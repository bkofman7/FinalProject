package FinalProject;


/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private int maxHealth;
    private int health;
    private int mana;
    private String name;
    private boolean isDead;
    private boolean a1cd, a2cd, a3cd;
    
    public Player(String name, int healthChange, int manaChange, String type) {
        health = 500 + healthChange;
        mana = 500 + manaChange;
        this.name = name;
        isDead = false;
        if (type.equals("mage"))
            maxHealth = 400;
        else if (type.equals("archer"))
            maxHealth = 500;
        else if (type.equals("warrior"))
            maxHealth = 600;
        a1cd = false;
        a2cd = false;
        a3cd = false;
    }
    
    public int takeHit(int dmg)
    {
        health = health - dmg;
        if (health <= 0)
            isDead = true;
        return health;
    }
    
    public int useAbility1() {
        return 1;
    }
    
    public int useAbility2() {
        return 0;
    }
    
    public int useAbility3() {
        return 0;
    }
    
    public boolean getCD(int ability) {
        if (ability == 1)
            return a1cd;
        if (ability == 2)
            return a2cd;
        else 
            return a3cd;
    }
    
    public void setCD(int ability, boolean cd) {
        if (ability == 1)
            a1cd = cd;
        if (ability == 2)
            a2cd = cd;
        if (ability == 3)
            a3cd = cd;
    }
    
    public int heal(int amt)
    {
        if ((health + amt) > maxHealth)
            health = maxHealth;
        else {
            health = health + amt;
        }
        return health;
    }
    
    public int getHealth() 
    {
        return health;
    }
    
    public int getMana() 
    {
        return mana;
    }
    
    public boolean isDead() 
    {
        return isDead;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    
}
