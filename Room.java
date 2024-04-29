

import java.util.ArrayList;

public class Room {

 
public String name;
public String desc;
public int roomChoices;

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
    



 /**
  * Method that prints out a bunch of possible actions and keywords that players can use to futher themselves in the game
  */
 public static void showOptions(){
  System.out.println(" Possible actions include: ");
  System.out.println(" + steal ___\n + drop __\n + look around\n + examine ___\n + check profit\n + attack\n + go north\n + go south\n + go east\n + go west\n");

 } 





 public String toString() {
   return name  + "," +  desc ;
 }

 public static void main(String[] args) {
 showOptions();
   
 

}
}






 