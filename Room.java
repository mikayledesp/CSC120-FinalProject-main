
import com.google.common.graph.*;
//import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.ArrayList;

public class Room {

 
public String name;
public String desc;
public int roomChoices;
//  public Hashtable<String, String> artifacts;
 public ArrayList<Artifact> portraitArtifacts; 
/**
 * Constructor with name and descrioption needed in order to build a room 
 * @param name
 * @param desc
 */
public Room (String name, String desc, int roomChoices){
  this.name = name;
  this.desc = desc;
  this.roomChoices = roomChoices;
  this.portraitArtifacts = new ArrayList<Artifact> ();
}
    
   
// Pick up method 
	// adds to inventory based on answer to prompt
  // 

 public String pickUp(String artifact){
   Scanner sc = new Scanner(System.in);
   String userInput = sc.nextLine();
   // for if statement: the user and artifact have to be in the same room
   
   


 

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


 // show options method 
 // has list of possible actions/ keywords
 // would override in rooms that have other action options.
 public static void showOptions(){
  System.out.println(" Possible actions include: ");
  System.out.println(" + pick up ___\n + drop __\n + look around\n + examine ___\n + go north\n + go south\n + go east\n + go west\n");

 } 


// Look around method shows room name and description(includes artifacts)


 public String toString() {
   return name  + "," +  desc ;
 }

 public static void main(String[] args) {
 showOptions();
   
 

}
}






 