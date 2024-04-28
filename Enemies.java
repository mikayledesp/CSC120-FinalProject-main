public class Enemies {

   public String name;
   public double health;
   public String speed;
   
   
   // information about enemy that tells player how to take them down
   public String hint;

   public Enemies(String name, double health, String hint){
    this.name = name;
    this.health = health;
    
    this.hint = hint;
   }
   public  double swingSword(String name){
    System.out.println("You have swung your mighty sword at the vicious Triceratops");
    health =- 10;
    if (health == 0){
        System.out.println("Effective Strike! However the beast still thrives, what's your next move? ");

    } else{
        System.out.println("You've defeated the beast!");
        System.out.println("Now, go onward to make your escape!");
    }

    return health;
   }
}
  
