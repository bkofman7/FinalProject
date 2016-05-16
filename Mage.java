package FinalProject;


/**
 * Write a description of class Mage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mage extends Player 
{
   private String ability1, ability2, ability3;
   private int ability1Cost, ability2Cost, ability3Cost; 
   public Mage()
   {
       super("Mage",-100,100,"mage");
   }
   public int useAbility1() 
   {
       if (getMana()<50) 
           return 0;
       else {
           setMana(getMana()-50);
           return -1;
       }
   }

   public int useAbility2() 
   {
       if (getMana()<50) 
           return 0;
       else {
           setMana(getMana()-50);
           return -2;
       }
   }
       
   public int useAbility3() 
   {
       return 15;
   }
}
