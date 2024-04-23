import java.util.ArrayList;
import java.util.Scanner;
import com.google.common.graph.*;

public class museum {
    
    private Room currentRoom;
    // private ImmutableGraph<Room>();
    public static Room portrait = new Room("Portrait Gallery", "Add Later", 0);
    Room apothacary = new Room("Old Apothacary", "Add Later", 2);
    Room historic = new Room("Historical House", "Add Later", 2);
    Room sculpture = new Room("Sculpture Garden", "Add Later", 2);
    Room armor = new Room("Armor and Weapons Gallery", "Add Later", 3);
    Room Animal = new Room("Animal Exhibit", "Add Later", 1);
    
    public ArrayList<Room> roomlist = new ArrayList<Room>();
    
    
   


    
    

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
        this.currentRoom = portrait;
        
        
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
        System.out.println("Game Description w insctuctions ");
        System.out.println("You have now entered the  " + portrait + " ");

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            userResponse = userInput.nextLine().toUpperCase();
             if (userResponse.equals("LOOK AROUND")){
                System.out.println("\nDescription of room + list of artifacts in room");
                System.out.println("");

             }
             if (userResponse.equals("?")){
                Room.showOptions();
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
