import java.util.Scanner;
import com.google.common.graph.*;

public class museum {
   
    Graph <Room> map;
    Room currentLoc;
    public museum(){
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
        // this.map = GraphBuilder< >.build();
        this.currentLoc = portrait1;
        }
        



    public static void main(String[] args) {
        Room room1 = new Room("Portrait Gallery", null, 0);
        Room room2 = new Room("Apothacary", null, 0);
        Room room3 = new Room("Historic", null, 0);
        Room room4 = new Room("Sculpture", null, 0);
        Room room5 = new Room("Armory", null, 0);
        Room room6 = new Room("Animal", null, 0);

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;
        museum mymuseum = new museum();
         mymuseum.currentLoc();
        

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

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             System.out.println("You have now entered the  " + this.room1 + "");
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("WIN") || userResponse.equals("LOSE")) {
                stillPlaying = false;
            }
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
