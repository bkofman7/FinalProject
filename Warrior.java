package FinalProject;


/**
 * Write a description of class Warrior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warrior extends Player 
{
   private String ability1, ability2, ability3;
   private int ability1Cost, ability2Cost, ability3Cost;
   public Warrior()
   {
       super("Warrior",100,-100,"warrior");
   }
   public int useAbility1() 
   {
       if (getMana()<50) 
           return 0;
       else {
           setMana(getMana()-50);
           return 100;
       }
   }

   public int useAbility2() 
   {
       if (getMana()<10) 
           return 0;
       else {
           setMana(getMana()-10);
           return 50;
       }
   }
       
   public int useAbility3() 
   {
       return 10;
   }
}
