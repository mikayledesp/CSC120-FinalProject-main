
import com.google.common.graph.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {

 public String name;
 public String desc;
 public int roomChoices;
 public ArrayList<Artifact> inventory;
/**
 * Constructor with name and descrioption needed in order to build a room 
 * @param name
 * @param desc
 */
 public Room (String name, String desc, int roomChoices){
    this.name = name;
    this.desc = desc;
    this.roomChoices = roomChoices;
 }
    
 // Room P  
// Pick up method 
	// adds to inventory based on answer to prompt

 public String pickUp(String artifact){
   Scanner sc = new Scanner(System.in);
   String pickUp = sc.nextLine();
   
   


 

   return null;
   
 } 

// drop method 
	 // removes from inverntory 
	 
// examine method


//fight method
// print out statement "You are now in fight with "  + opponent 
// lists 4 possible options 
// if statement that correlates the right option with defeating the opponent ie(right punch destroys bear put not a sculpture or snake )
// if wring one is picked you loose. 

// enterRoom method 
 //if room choice is more than 1, make print statement asking user what room they want to go in


 // show options method 
 // has list of possible actions/ keywords
 // would override in rooms that have other action options.



// Look around method shows room name and description(includes artifacts)

 public String toString() {
   return name + " (" + desc + ")";
 }

 public static void main(String[] args) {

   
  Room room1 = new Room("Portrait Gallery", null, 0);
  Room room2 = new Room("Apothacary", null, 0);
  Room room3 = new Room("Historic", null, 0);
  Room room4 = new Room("Sculpture", null, 0);
  Room room5 = new Room("Armory", null, 0);
  Room room6 = new Room("Animal", null, 0);
 

}
}






 