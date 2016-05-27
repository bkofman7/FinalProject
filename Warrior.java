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
       if (getMana()>=50 && getCD(1)==false) {
           setMana(getMana()-50);
           putAbilityOnCD(5,1);
           return 100;}
       else 
       {return 0;} 
   }

   public int useAbility2() 
   {
       if (getMana()>=10 && getCD(2)==false) {
           setMana(getMana()-10);
           putAbilityOnCD(3,2);
           return 50;}
       else 
       {return 0;}     
   }
       
   public int useAbility3() 
   {
       if (getCD(3)==false) {
       putAbilityOnCD(0,3);
       return 10;
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
