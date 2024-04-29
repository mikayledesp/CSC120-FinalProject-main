
public class Enemies {

   public String name;
   public int health;
   public String speed;
  
   
   
   // information about enemy that tells player how to take them down
   public String hint;

   public Enemies(String name, int health, String hint){
    this.name = name;
    this.health = health;
    
    this.hint = hint;
   }
}
  
