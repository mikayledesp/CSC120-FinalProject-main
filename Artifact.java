public class Artifact{


public String name;
 public String desc;
 public double value;
 
 public Artifact(String name , String desc, double value){
    this.name = name;
    this.desc = desc; 
    this.value = value;
 }

 
 public String toString() {
   return name + " is a " + desc ;
 }
 public static void main(String[] args) {
  
 }
 

}
