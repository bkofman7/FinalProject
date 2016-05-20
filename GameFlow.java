package FinalProject;
import java.awt.Graphics;
import javax.swing.*;
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
        JFrame frame = new JFrame("TypeWarrior");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(575,400);
        frame.pack();
        frame.setVisible(true);
        //start game
        panel.setConsoleText("Welcome to Type Warrior");
        
    }
    public static String setCommand(String command) {
        return command;
    }
}
