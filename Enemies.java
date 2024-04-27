public class Enemies {

   public String name;
   public String health;
   // information about enemy that tells player how to take them down
   public String hint;

   public Enemies(String name, String health, String hint){
    this.name = name;
    this.health = health;
    this.hint = hint;
   }
   public String fight(){
    

    return health;
   }
}
