package FinalProject;


/**
 * Write a description of class Archer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Player 
{
   private String ability1, ability2, ability3;
   private int ability1Cost, ability2Cost, ability3Cost;
   public Archer()
   {
       super("Archer",0,0,"archer");
   }
   public int useAbility1() 
   {
       if (getMana()<50) 
           return 0;
       else {
           setMana(getMana()-50);
           return 50;
       }
   }

   public int useAbility2() 
   {
       return 5;
   }
       
   public int useAbility3() 
   {
       if (getMana()<100) 
           return 0;
       else {
           setMana(getMana()-100);
           return 200;
       }
   }
}
