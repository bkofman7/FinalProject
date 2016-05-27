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
       if (getMana()>=50 && getCD(1)==false) {
           setMana(getMana()-50);
           putAbilityOnCD(3,1);
           return 50;}
       else 
       {return 0;} 
   }

   public int useAbility3() 
   {
       if (getMana()>=100 && getCD(3)==false) {
           setMana(getMana()-100);
           putAbilityOnCD(20,3);
           return 200;}
       else 
       {return 0;}     
   }
       
   public int useAbility2() 
   {
       if (getCD(3)==false) {
       putAbilityOnCD(0,2);
       return 5;
       }
       else
       {return 0;}
   }
   
   public void putAbilityOnCD (int cd, int ability) {
        setCD(ability,true);
        try {Thread.sleep(cd*1000);
        } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();}
        setCD(ability,false);
    }
}
