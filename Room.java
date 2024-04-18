
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
  // 

 public String pickUp(String artifact){
   Scanner sc = new Scanner(System.in);
   String pickUp = sc.nextLine();
   
   


 

   return null;
   
 } 

// drop method 
	 // removes from inverntory 
	 
// examine method


//fight method 

// enterRoom method 
 //if room choice is more than 1, make print statement asking user what room they want to go in



// Look around method shows artifacts 

 public String toString() {
   return name + " (" + desc + ")";
 }

 public static void main(String[] args) {

   

   // Example ImmutableGraph with Buildings as Node data
  
 Room portrait1 = new Room("Portrait Gallery", "Add later", 1);
 Room apothacary2 = new Room("Old Apothacary", "Add Later", 2);
 Room historic3 = new Room("Historical House", "Add Later", 2);
 Room sculpture4 = new Room("Sculpture Garden", "Add Later", 2);
 Room armor5 = new Room("Armor and Weapons Gallery", "Add Later", 3);
 Room Animal6 = new Room("Animal Exhibit", "Add Later", 1);
// portrait = 


 
   ImmutableGraph<Room> myGraph1 = GraphBuilder.undirected()
     .<Room>immutable()
     .putEdge(portrait1, apothacary2)
     .putEdge(apothacary2, historic3)
     .putEdge(apothacary2, sculpture4)
     .putEdge(historic3,sculpture4)
     .putEdge(sculpture4, armor5)
     .putEdge(armor5, Animal6)
     

   //   .putEdge(mcConnell, sabinReed)
   //   .putEdge(sabinReed, burton)
     .build();

    //  System.out.println(myGraph1);
 }

}






 