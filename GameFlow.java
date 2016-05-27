package FinalProject;
import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class GameController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameFlow
{
    public static void main (String [] args) {
        //initialize panel    
        myPanel panel = new myPanel();
        fightingPanel panel2 = new fightingPanel();
        JFrame frame = new JFrame("TypeWarrior");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        panel.setBackground(new Color(255,255,255));
        frame.setSize(575,400);
        frame.pack();
        frame.setVisible(true);
        //start game
        panel.setConsoleText("Welcome to Type Warrior");
        GameFlow.delay(3000);
        panel.setConsoleText("Choose your character");
        panel.makeButtonsVisible();
        int choice = 0;
        boolean run = true;
        while (run) {
            choice = panel.returnChoice();
            panel.setT(choice);
            if (choice!=0) {
                run = false;
            }
            
        }
        switch (choice) {
            
            //player will play as a warrior
            case 1: frame.getContentPane().add(panel2);              // change frame to battle
                    panel2.setVisible(true);
                    panel2.setBackground(new Color(255,255,255));
                    panel.setVisible(false);
                    panel2.setPlayerPic(1);
                    panel2.setAbility1Name("smite");
                    panel2.setAbility2Name("heavy strike");
                    panel2.setAbility3Name("light strike");
                    
                    Monster monster1 = new Dragon();                 //battling
                    Player warrior = new Warrior();               
                    while (warrior.getHealth()>0 && monster1.getHealth()>0) {
                        panel2.changePlayerHealth(warrior.getHealth());
                        panel2.changeDragonHealth(monster1.getHealth());
                        panel2.changePlayerMana(warrior.getMana());
                        if (panel2.getLastCommand().equalsIgnoreCase("smite"))
                            monster1.takeHit(warrior.useAbility1());
                        if (panel2.getLastCommand().equalsIgnoreCase("heavy strike"))
                            monster1.takeHit(warrior.useAbility2());
                        if (panel2.getLastCommand().equalsIgnoreCase("light strike"))
                            monster1.takeHit(warrior.useAbility3());
                    
                    }
                    
                    
                    
                    
                    
            //player will play as an archer        
            case 2: frame.getContentPane().add(panel2);              // change frame to battle
                    panel2.setVisible(true);
                    panel2.setBackground(new Color(255,255,255));
                    panel.setVisible(false);
                    panel2.setPlayerPic(2);
                    panel2.setAbility1Name("flaming arrow");
                    panel2.setAbility2Name("shot");
                    panel2.setAbility3Name("super duper epic golden arrow");                    
                    
                    Monster monster2 = new Dragon();                 //battling
                    Player archer = new Archer();
                    while (archer.getHealth()>0 && monster2.getHealth()>0) {
                        
                    }
                    
                    
                    
                    
                    break;
                    
                    
            //player will play as a mage        
            case 3: frame.getContentPane().add(panel2);              // change frame to battle
                    panel2.setVisible(true);
                    panel2.setBackground(new Color(255,255,255));
                    panel.setVisible(false);
                    panel2.setPlayerPic(3);
                    panel2.setAbility1Name("stun");
                    panel2.setAbility2Name("agitate");
                    panel2.setAbility3Name("fireball");                    
                    
                    Monster monster3 = new Dragon();                 //battling
                    Player mage = new Mage();
                    while (mage.getHealth()>0 && monster3.getHealth()>0) {
                        
                    }
                    
                    
                    
                    break;
        }
        
        
    }
    
    public static String setCommand(String command) {
        return command;
    }
    private static void delay(int milliseconds) {
        try {Thread.sleep(milliseconds);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();}
    }
}
