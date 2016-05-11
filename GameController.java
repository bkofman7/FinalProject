package FinalProject;

import javax.swing.*;
/**
 * Write a description of class GameController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameController
{
    public static void main (String [] args) {
        JFrame frame = new JFrame("TypeWarrior");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new myPanel());
        frame.setSize(575,400);
        frame.setVisible(true);
        
    }
}
