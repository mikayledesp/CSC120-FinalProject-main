

import java.util.ArrayList;

public class Room {

 
public String name;
public String desc;
public String look;
public int roomChoices;

 public ArrayList<Artifact> portraitArtifacts; 
/**
 * Constructor with name and descrioption needed in order to build a room 
 * @param name
 * @param desc
 */
public Room (String name, String desc, String look, int roomChoices){
  this.name = name;
  this.desc = desc;
  this.look = look;
  this.roomChoices = roomChoices;
  this.portraitArtifacts = new ArrayList<Artifact> ();
}
    



 /**
  * Method that prints out a bunch of possible actions and keywords that players can use to futher themselves in the game
  */
 public static void showOptions(){
  System.out.println(" Possible actions include: ");
  System.out.println(" + steal ___\n + drop __\n  + examine ___\n + check profit\n + attack\n + (1) go north\n + (2) go south\n + (3) go east\n + (4) go west\n + exit");

 } 
/**
 * Method only prints out possible directions for use after every input in game loop
 */
 public static void showDirections(){{
  System.out.println("\nTo Move to another exhibit type in either: ");
  System.out.println(" 1) north, 2) south, 3) east, 4) west\n");
 }}





 public String toString() {
   return name  + "," +  desc ;
 }

 public static void main(String[] args) {
 showOptions();
   
 

}
}






 