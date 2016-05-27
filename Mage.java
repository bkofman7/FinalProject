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
       if (getMana()>=50 && getCD(1)==false) {
           setMana(getMana()-50);
           putAbilityOnCD(10,1);
           return 0;}
       else 
       {return 0;} 
   }

   public int useAbility2() 
   {
       if (getMana()>=50 && getCD(2)==false) {
           setMana(getMana()-50);
           putAbilityOnCD(5,2);
           return 0;}
       else 
       {return 0;}     
   }
       
   public int useAbility3() 
   {
       if (getCD(3)==false) {
       putAbilityOnCD(1,3);
       return 15;
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
