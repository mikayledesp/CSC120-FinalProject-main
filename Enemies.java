
public class Enemies {

   public String name;
   public int health;
   public String speed;
  
   
   
   // information about enemy that tells player how to take them down
   public String hint;
   /**
    * Constructor that takes in  basic information about the enemy in order for it to be used in the musuem class!
    * @param name
    * @param health
    * @param hint
    */
   public Enemies(String name, int health, String hint){
    this.name = name;
    this.health = health;
    
    this.hint = hint;
   }
}
  
