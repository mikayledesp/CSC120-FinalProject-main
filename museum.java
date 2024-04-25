import java.util.ArrayList;
import java.util.Scanner;
import com.google.common.graph.*;

public class museum {
    
    public static Room currentRoom;


    // private ImmutableGraph<Room>();
    //addition of rooms in musuem 
    public static Room portrait = new Room("Portrait Gallery", " Add Later", 0);
    // Artifacts in Portrait Gallery
    
    public static Room apothacary = new Room("Old Apothacary Exhibit ", " Add Later", 2);
    public static Room historic = new Room("Historical House", " This Historic House dates all the way back to 1970!", 2);
    public static Room sculpture = new Room("Sculpture Garden", " Add Later", 2);
    public static Room armor = new Room("Armor and Weapons Gallery", " This exhibit hosts a multitude of medival swords and shields. It also has the finest chain mill in the west, this  armor that was essential for any battle. ", 3);
    public static Room Animal = new Room("Animal Exhibit", " This exhibit is home to the largest T-Rex! It's skeleton towers 12 feet in the air! ", 1);
    
    // public ArrayList<Room> roomlist = new ArrayList<Room>();

    // public static ArrayList<Artifact> portraitArtifacts = new ArrayList<Artifact>();
    // this.portraitArtifacts = new ArrayList<Artifact>();

    public Artifact portrait1 = new Artifact("Girl with a Pearl Earring", "A 1665 portrait by Joahnnes Vermeer that emphasizes the Dutch master’s ability to capture light and emotion", 20); 
    // this.portraitArtifacts.addArtifact(portrait1);
    

    // this.portraitArtifacts.add(this.portrait1);  

    // public ArrayList<Artifact> apothArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> histoicArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> sculptureArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> weaponsArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> animalArtifacts = new ArrayList<Artifact>(); 
   

    


    //addition of artifacts in each room
    

    Graph <Room> map;
    Room currentLoc;
    public museum(){

    ImmutableGraph<Room> myGraph1 = GraphBuilder.undirected()
        .<Room>immutable()
        .putEdge(portrait, apothacary)
        .putEdge(apothacary, historic)
        .putEdge(apothacary, sculpture)
        .putEdge(historic,sculpture)
        .putEdge(sculpture, armor)
        .putEdge(armor, Animal)
        .build();
        currentRoom = portrait;
        
        
        }
        
        //move method should go in musuem 


    public static void main(String[] args) {
        

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;
        museum mymuseum = new museum();
        //  mymuseum.currentLoc();
        

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°");
        System.out.println("    Welcome To Our Game! ");
        System.out.println("˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°");

        // Instructions are sometimes helpful
        System.out.println("\nYou, a comptetent but broke theif, have been tasked with stealing important artifacts so that you can sell them off later. Hattfield Musuem (name can be changed later) has a huge collection  of the finest jewelery and paintings the nirtheast has to offer.\n Your goal is to collect artifacts that will get you the most profit. ");
        System.out.println("\nYou have now entered the  " + portrait );

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             userResponse = userInput.nextLine().toUpperCase();

             if (currentRoom == portrait && userResponse.equals("LOOK AROUND")){
               System.out.println("Artifact list print out would go here");
              
               userResponse = userInput.nextLine().toUpperCase();
                
             }
             if (userResponse.equals("HELP") || (userResponse.equals("?"))){
                Room.showOptions();
                userResponse = userInput.nextLine().toUpperCase();
             }
             if(userResponse.equals("PICK UP PAINTING")){
                //ADD TO INVENTORY METHOD WOULD GO HERE 
                System.out.println("You have added it to your inventory");
             }
             if (currentRoom == portrait && userResponse.equals("GO SOUTH")){
                
                System.out.println("You are now going South! Heading towards the " + apothacary);
                currentRoom = apothacary;
                userResponse = userInput.nextLine().toUpperCase();
                
                
                 
             }
             // ************************************************
             // actions in apothacary will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == apothacary && userResponse.equals("LOOK AROUND")){
                System.out.println("Artifact list print out would go here");
                
                userResponse = userInput.nextLine().toUpperCase();
                 
              }
             if (currentRoom == apothacary && userResponse.equals("GO NORTH")){
                System.out.println("\nYou are now going back north! Heading towards the " + portrait);
                currentRoom = portrait;
                userResponse = userInput.nextLine().toUpperCase();
             }
             if (currentRoom == apothacary && userResponse.equals("GO SOUTH")){
                System.out.println("\nYou are now going south! Heading towards the " + sculpture);
                currentRoom = sculpture;
                userResponse = userInput.nextLine().toUpperCase();
             }

             if (currentRoom == apothacary && userResponse.equals("GO EAST")){
                System.out.println("\nYou are now going east! Heading towards the " + historic);
                currentRoom = historic;
                userResponse = userInput.nextLine().toUpperCase();
             }
             
              











             // ************************************************
             // actions in historic house will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == historic && userResponse.equals("LOOK AROUND")){
                System.out.println("Artifact list print out would go here");
                
                userResponse = userInput.nextLine().toUpperCase();
                 
              }
             if (currentRoom == historic && userResponse.equals("GO WEST")){
                System.out.println("\nYou are now going west! Heading towards the " + apothacary);
                currentRoom = apothacary;
                userResponse = userInput.nextLine().toUpperCase();
                
             }  
             if (currentRoom == historic && userResponse.equals("GO SOUTH")){
                System.out.println("\nYou are now going south! Heading towards the " + armor);
                currentRoom = armor;
                userResponse = userInput.nextLine().toUpperCase();

             }
             
             










             // ************************************************
             // actions in scultputre exhibit  will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == sculpture && userResponse.equals("LOOK AROUND")){
                System.out.println("Artifact list print out would go here");
               
                userResponse = userInput.nextLine().toUpperCase();
                 
              }   
             if (currentRoom == sculpture && userResponse.equals("GO NORTH")){
                System.out.println("\nYou are now going north! Heading towards the " + apothacary);
                currentRoom = apothacary;
                userResponse = userInput.nextLine().toUpperCase();

             }
             if (currentRoom == sculpture && userResponse.equals("GO EAST")){
                System.out.println("\nYou are now going east! Heading towards the " + armor);
                currentRoom = armor;
                userResponse = userInput.nextLine().toUpperCase();

             }










             // ************************************************
             // actions in armor exhibit  will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == armor && userResponse.equals("LOOK AROUND")){
                System.out.println("Artifact list print out would go here");
               
                userResponse = userInput.nextLine().toUpperCase();
                 
              }
             if (currentRoom == armor && userResponse.equals("GO NORTH")){
                System.out.println("\nYou are now going north! Heading towards the " + historic);
                currentRoom = historic;
                userResponse = userInput.nextLine().toUpperCase();
             }
             if (currentRoom == armor && userResponse.equals("GO WEST")){
                System.out.println("\nYou are now going west! Heading towards the " + sculpture);
                currentRoom = sculpture;
                userResponse = userInput.nextLine().toUpperCase();

             }
             if (currentRoom == armor && userResponse.equals("GO SOUTH")){
                System.out.println("\nYou are now going south! Heading towards the " + Animal);
                currentRoom = Animal;
                userResponse = userInput.nextLine().toUpperCase();

             }
            



             // ************************************************
             // actions in animal will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == Animal && userResponse.equals("LOOK AROUND")){
                System.out.println("Artifact list print out would go here");
               
                userResponse = userInput.nextLine().toUpperCase();
                 
              }
             if (currentRoom == Animal && userResponse.equals("GO NORTH")){
                System.out.println("\nYou are now going north! Heading towards the " + armor);
                currentRoom = armor;
                userResponse = userInput.nextLine().toUpperCase();
             }










             if (userResponse.equals("WHAT ROOM AM I IN")){
                System.out.println(currentRoom);
             }



             

             
             


            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            // if (userResponse.equals("WIN") || userResponse.equals("LOSE")) {
            //     stillPlaying = false;
            // }
        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }

    }

}
