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
    }
    
    public int takeHit(int dmg)
    {
        health = health - dmg;
        if (health <= 0)
            isDead = true;
        return health;
    }
    
    abstract public int useAbility1(); 
    
    abstract public int useAbility2(); 
    
    abstract public int useAbility3(); 
    
    
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
