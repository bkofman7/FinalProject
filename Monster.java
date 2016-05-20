package FinalProject;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster
{
    private boolean isStunned;
    private boolean isDead;
    private int health;
    private String name;
    public Monster (int health, String name, boolean x, boolean y) {
        this.health = health;
        this.name = name;
        isStunned = x;
        isDead = y;
    }
    abstract public int attack();
    
    public boolean isStunned() {
        return isStunned;
    }
    public void getAgitated() {
        Timer damageSelf = new Timer();
        damageSelf.scheduleAtFixedRate(new RemindTask(), 0, 10000);
    }
    public int takeHit(int dmg) {
        health = health - dmg;
        if (health <= 0)
            isDead = true;
        return health;
    }
    public void hurtSelf() {
        takeHit(10);
    }
    class RemindTask extends TimerTask {
        public void run() {
            hurtSelf();
        }
    }
    public boolean isDead() {
        return isDead;
    }
}
