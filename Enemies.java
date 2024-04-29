
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
   /**
    * Attack method decreases health of Triceratops opponent as it is called 
    * @param health
    * @return
    */
   public  double swingSword(int health){
        System.out.println("You have swung your mighty sword at the vicious Triceratops");
        health = health - 10;

        return health;
   }
}
  
