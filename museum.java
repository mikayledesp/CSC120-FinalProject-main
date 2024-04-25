import java.util.ArrayList;
import java.util.Scanner;
import com.google.common.graph.*;

public class museum {
    
    public static Room currentRoom;


    
    //addition of rooms in musuem 
    public static Room portrait = new Room("Portrait Gallery", " Add Later", 0);
    // Artifacts in Portrait Gallery
    
    public static Room apothacary = new Room("Old Apothacary Exhibit ", " Add Later", 2);
    public static Room historic = new Room("Historical House", " This Historic House dates all the way back to 1970!", 2);
    public static Room sculpture = new Room("Sculpture Garden", " Add Later", 2);
    public static Room armor = new Room("Armor and Weapons Gallery", " This exhibit hosts a multitude of medival swords and shields. It also has the finest chain mill in the west, this  armor that was essential for any battle. ", 3);
    public static Room Animal = new Room("Animal Exhibit", " This exhibit is home to the largest T-Rex! It's skeleton towers 12 feet in the air! ", 1);
    


    // public ArrayList<Artifact> apothArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> histoicArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> sculptureArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> weaponsArtifacts = new ArrayList<Artifact>(); 
    // public ArrayList<Artifact> animalArtifacts = new ArrayList<Artifact>(); 
   
    

    Graph <Room> map;
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
        //addition of artifacts to portrait
        ArrayList<Artifact> portraitList = new ArrayList<>();
        Artifact portrait1 = new Artifact("\nGirl with a Pearl Earring", "A 1665 portrait by Joahnnes Vermeer that emphasizes the Dutch master’s ability to capture light and emotion", 20); 
        Artifact portrait2 = new Artifact("\nSelf-Portrait with Cropped Hair", "A 1940 self-portrait by Frida Kahlo right after her divorce from Diego Rivera. She abandoned her feminine image, expressing her own independence and separation from men", 40);
        Artifact portrait3 = new Artifact("\nMona Lisa", "A 1503-1506 portrait known as a masterpiece of the Italian Renaissance and a piece of intrigue due to the subject’s enigmatic expression", 40);
        portraitList.add(portrait1);
        portraitList.add(portrait2);
        portraitList.add(portrait3);
        // addition of artifacts to apothacary

        // inventory list of type Artifact
        ArrayList<Artifact> inventory = new ArrayList<>();


        
       
        

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;
       
        
        

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°");
        System.out.println("    Welcome To Our Game! ");
        System.out.println("˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°");

        // Instructions are sometimes helpful
        System.out.println("\nYou, a comptetent but broke theif, have been tasked with stealing important artifacts so that you can sell them off later. Hattfield Musuem (name can be changed later) has a huge collection  of the finest jewelery and paintings the Northeast has to offer.\n  \nGOAL: steal artifacts that will get you the most profit. ");
        System.out.println("\nYou have now entered the  " + portrait );
        currentRoom = portrait;

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             userResponse = userInput.nextLine().toUpperCase();

             if (currentRoom == portrait && userResponse.equals("LOOK AROUND")){
                System.out.println("Upon entering the Portrait Gallery you are met with dozens of faces housed in gold frames. A few paintings catch your eye:\n " + "\n" + portrait1  + "\n" + portrait2  + "\n" +portrait3);
                
              
               userResponse = userInput.nextLine().toUpperCase();
                
             }
             if(currentRoom == portrait && userResponse.equals("EXAMINE GIRL WITH A PEARL EARRING")){
               System.out.println(portrait1.desc);
               userResponse = userInput.nextLine().toUpperCase();
            }
             
             if(currentRoom == portrait && userResponse.equals("PICK UP GIRL WITH A PEARL EARRING")){
                System.out.println("Stealing from exhibit.....");
                portraitList.remove(portrait1);
                inventory.add(portrait1);
                System.out.println("\nYou have added" + portrait1 +"to your inventory");
             }
             if(currentRoom == portrait && userResponse.equals("PICK UP MONA LISA")){
                System.out.println("Stealing from exhibit.....");
                System.out.println("Uh-oh Alarms sound! Did you really think you could steal the Mona Lisa? You've overshooted your shot buddy!");
                System.out.println("Game Over!");
                stillPlaying = false;
             }
             if (currentRoom == portrait && userResponse.equals("PICK UP SELF-PORTRAIT WITH CROPPED HAIR")){
                System.out.println("Stealing from exhibit.....");
                portraitList.remove(portrait3);
                inventory.add(portrait3);
                System.out.println("\nYou have added" + portrait3 +"to your inventory");
             }
             if (currentRoom == portrait && userResponse.equals("GO SOUTH")){
                
                System.out.println("You are now going South! Heading towards the " + apothacary);
                currentRoom = apothacary;
                userResponse = userInput.nextLine().toUpperCase();

                 
             }

             if (currentRoom == portrait && userResponse.equals("GO NORTH") || userResponse.equals("GO EAST") || userResponse.equals("GO WEST") ){
               System.out.println("ERROR: you cannot go in this direction, please try another one!");
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









             // strings that work across all rooms
             if (userResponse.equals("WHAT ROOM AM I IN")){
                System.out.println(currentRoom);
             }
             if(userResponse.equals("INVENTORY")){
                System.out.println(inventory);
             }
             if (userResponse.equals("HELP") || (userResponse.equals("?"))){
               Room.showOptions();
               userResponse = userInput.nextLine().toUpperCase();
            }
            // if(userResponse == !String)
            //print out statements syaing you need to type words in! 



             

             
             


            
        } while (stillPlaying);

        //close scanner
        userInput.close();

        
        if (stillPlaying == false) {
            System.out.println("Better luck next time.");
        } 
    }

}
