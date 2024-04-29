import java.util.ArrayList;
import java.util.Scanner;
import com.google.common.graph.*;

public class museum {
    
 public static Room currentRoom;
 public static int profit;
 


    
    //addition of rooms in musuem 
    public static Room portrait = new Room("Portrait Gallery", " This gallery houses portraits across all eras of art history" , 0);
    public static Room apothacary = new Room("Old Apothacary Exhibit ", " Add Later", 2);
    public static Room historic = new Room("Historical House", " This Historic House dates all the way back to 1970!", 2);
    public static Room sculpture = new Room("Sculpture Garden", " Add Later", 2);
    public static Room armor = new Room("Armor and Weapons Gallery", " This exhibit hosts a multitude of medival swords and shields. It also has the finest chain mill in the west, this  armor that was essential for any battle. ", 3);
    public static Room Animal = new Room("Animal Exhibit", " This exhibit is home to the largest T-Rex! It's skeleton towers 12 feet in the air! ", 1);
    

    
    public museum(){

    ImmutableGraph<Room> myGraph1 = GraphBuilder.directed()
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
        ArrayList<Artifact> apothacaryList = new ArrayList<>(); 
        //changed it so that pearl earring resides in the historic house instead becuase it makes  little more sense narratively
      //   Artifact apothacary1 = new Artifact("pearl","Add later",5); 
        Artifact apothacary2 = new Artifact("scissors", "Add later", 5); 
      //   apothacaryList.add(apothacary1); 
        apothacaryList.add(apothacary2); 

        // addition of artifacts to house
        ArrayList<Artifact> houseList = new ArrayList<>(); 
        Artifact house1 = new Artifact("\nSony Walkman", "This vintage walkman is ", 0);
        Artifact house2 = new Artifact("\nFine China Teacups", "A set of two Fine China Teacups that have pink and green flowers imprinted near the lip of the tea cup. ", 0);
        Artifact house3 = new Artifact("\nPearl Tiffany & Co Necklace", "A Gold chain with a pearl teardrop pendant hanging from it.", 0);
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

         //addition of artifacts to armor
         ArrayList<Artifact> armorList = new ArrayList<>();
         Artifact armor1 = new Artifact("  Sword With a Lapis Lazuli Encrusted Hilt", null, 0);
         Artifact armor2 = new Artifact(" Curved Dagger with a Black Hilt", null, 0);
         Artifact armor3 = new  Artifact(" Golden Javelin ", null, 0);
         armorList.add(armor1);
         armorList.add(armor2);
         armorList.add(armor3);
        
        // inventory list of type Artifact
        //note : the apothacary items should proabably be added to the inventory once user has entered room 
        ArrayList<Artifact> inventory = new ArrayList<>();
      //   inventory.add(apothacary1);
      //   inventory.add(apothacary2); 

        
       
        // Enemies for different rooms are constructed bellow ↓
         Enemies Triceratops = new Enemies("Triceratops", 20, "To engage with this thing you may need ");

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

        System.out.println("\nYou, a comptetent but broke theif, have been tasked with stealing important artifacts so that you can sell them off later. Hattfield Musuem has a huge collection  of the finest jewelery and paintings the Northeast has to offer.\n  \nGOAL: steal artifacts that will get you the most profit. ");
        Room.showOptions();
        System.out.println("HINT: You may want to look around ane examine each items before you steal them!");
        System.out.println("\nYou have now entered the  " + portrait );
        currentRoom = portrait;
        

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             userResponse = userInput.nextLine().toUpperCase();

             if (currentRoom == portrait && userResponse.equals("LOOK AROUND")){
               System.out.println("Upon entering the Portrait Gallery you are met with dozens of faces housed in gold frames. A few paintings catch your eye:\n Girl With a Pearl Earring, The Mona Lisa and a Self-Portrait with Cropped Hair " );
               userResponse = userInput.nextLine().toUpperCase();
             }

             // Portrait Gallery Examine 
             if(currentRoom == portrait && userResponse.equals("EXAMINE GIRL WITH A PEARL EARRING")){
               System.out.println(portrait1.desc);
               userResponse = userInput.nextLine().toUpperCase();
             }
            
             if(currentRoom == portrait && userResponse.equals("EXAMINE SELF-PORTRAIT WITH CROPPED HAIR")){
               System.out.println(portrait2.desc);
               userResponse = userInput.nextLine().toUpperCase();
             }

             if(currentRoom == portrait && userResponse.equals("EXAMINE MONA LISA")){
               System.out.println(portrait3.desc);
               userResponse = userInput.nextLine().toUpperCase();
             }
             
             // Portrait Gallery Steal 
             if(currentRoom == portrait && userResponse.equals("STEAL GIRL WITH A PEARL EARRING")){
               if (!inventory.contains(house3) )
                  System.out.println("The girl seems to be awaking. She says behind the frame, “I refuse to be taken off this wall until my other pearl earring is returned to me. Please find it in the Museum.” It looks like stealing a painting requires additional steps.");  

               else {
                  System.out.println("Stealing from exhibit.....");
                  inventory.remove(house3); 
                  System.out.println("The " + house3.name + " has been removed from your inventory and given to the Girl with a Pearl Earring");
                  portraitList.remove(portrait1);
                  inventory.add(portrait1);
                  System.out.println(portrait1.name + " has been added to your inventory");
               }
            }
         
             if (currentRoom == portrait && userResponse.equals("STEAL SELF-PORTRAIT WITH CROPPED HAIR") || userResponse.equals("STEAL SELF-PORTRAIT")){
               if (!inventory.contains(apothacary2) )
                  System.out.println("Frida Kahlo’s eyes seem to start blinking at you and her painted portrait opens its mouth, “You cannot take me off the wall until you deliver me a pair of scissors, I need to cut my hair.” It looks like you must keep searching around the museum if you want to steal this painting.");  
               else {
                  System.out.println("Stealing from exhibit...");
                  inventory.remove(apothacary2); 
                  System.out.println("The " + apothacary2.name + " have been removed from your inventory and given to Frida Kahlo");
                  portraitList.remove(portrait2);
                  inventory.add(portrait2);
                  System.out.println(portrait2.name + " has been added to your inventory");
               }
             }

             if(currentRoom == portrait && userResponse.equals("STEAL MONA LISA")){
                System.out.println("Stealing from exhibit.....");
                System.out.println("Uh-oh Alarms sound! Did you really think you could steal the Mona Lisa? You've overshooted your shot buddy!");
                System.out.println("Game Over!");
                stillPlaying = false;
             }
            
             if (currentRoom == portrait && userResponse.equals("GO SOUTH")){
                
                System.out.println("You are now going South! Heading towards the " + apothacary);
                currentRoom = apothacary;
                userResponse = userInput.nextLine().toUpperCase();
                 
             }

             if (currentRoom == portrait && userResponse.equals("GO NORTH") || currentRoom == portrait && userResponse.equals("GO EAST") || currentRoom == portrait && userResponse.equals("GO WEST") ){
               System.out.println("ERROR: you cannot go in this direction, please try another one!");
             }
            

             // ************************************************
             // actions in apothacary will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == apothacary && userResponse.equals("LOOK AROUND")){
               //  System.out.println("Artifact list print out would go here");
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
               System.out.println(" As you head east, a small recreation of an A-frame house appears. Upon entering the house you are met with tons of vintage items from the 1970's including a Sony Walkman, a set of two Fine China Teacups and a Pearl Pendant Tiffany & Co Necklace.");
                
               userResponse = userInput.nextLine().toUpperCase();
                 
              }
              if (currentRoom == historic && userResponse.equals("EXAMINE SONY WALKMAN") || userResponse.equals("EXAMINE WALKMAN")){
               System.out.println(house1.desc);
               System.out.println("Hmmm.....this item may be helpful later on but it doesn't have a high value");
               System.out.println("To steal or not to steal...");
              }
              if (currentRoom == historic && userResponse.equals("STEAL SONY WALKMAN") || userResponse.equals("STEAL WALKMAN")){
              houseList.remove(house1);
              inventory.add(house1);
              System.out.println("Stealing walkman...");
              profit += house1.value;
              }

              if (currentRoom == historic && userResponse.equals("EXAMINE FINE CHINA TEACUPS") || userResponse.equals("EXAMINE TEACUPS")){
               System.out.println(house2.desc);
              }
              if (currentRoom == historic && userResponse.equals("STEAL FINE CHINA TEACUPS") || userResponse.equals("STEAL TEACUPS")){
               houseList.remove(house2);
               inventory.add(house2);
               System.out.println("Stealing teacups...");
              }
              if (currentRoom == historic && userResponse.equals("EXAMINE PEARL PENDANT") || userResponse.equals("EXAMINE PEARL PENDANT TIFFANY & CO NECKLACE") || userResponse.equals("EXAMINE NECKLACE")){
               System.out.println(house3.desc);
              }
              if (currentRoom == historic && userResponse.equals("STEAL PEARL PENDANT") || userResponse.equals("STEAL PEARL PENDANT TIFFANY & CO NECKLACE") || userResponse.equals("STEAL NECKLACE")){
               houseList.remove(house3);
               inventory.add(house3);
               System.out.println("Stealing pearl pendant...");
              }
              

             if (currentRoom == historic && userResponse.equals("GO WEST")){
                System.out.println("\nYou are now going west! Heading back towards the " + apothacary);
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
                System.out.println("Upon entering the dimily lit armory you see many swords and daggers hanging neatly from the walls! A few of them catch your eye: A Sword With a Lapus Encrusted Hilt, A curved Dagger with a Black Hilt and, a Golden Javelin  ");
                userResponse = userInput.nextLine().toUpperCase();  
              }
             if (currentRoom == armor && userResponse.equals("EXAMINE SWORD") || currentRoom == armor && userResponse.equals("EXAMINE SWORD WITH A LAPIS LAZULI ENCRUSTED HILT") ){ 
                System.out.println(armor1.desc);
             }
             if (currentRoom == armor && userResponse.equals("STEAL SWORD") || currentRoom == armor && userResponse.equals("STEAL SWORD WITH A LAPIS LAZULI ENCRUSTED HILT") ){ 
               System.out.println("Stealing Sword...");
               armorList.remove(armor1);
               inventory.add(armor1);
               System.out.println(armor1.name + "has been successfully added to inventory");
            }
             if (currentRoom == armor && userResponse.equals("EXAMINE DAGGER") || currentRoom == armor && userResponse.equals("EXAMINE CURVED DAGGER WITH A BLACK HILT") ){ 
                System.out.println(armor2.desc);
             }
             if (currentRoom == armor && userResponse.equals("STEAL DAGGER") || currentRoom == armor && userResponse.equals("STEAL CURVED DAGGER WITH A BLACK HILT") ){ 
               System.out.println("Stealing Dagger....");
               armorList.remove(armor2);
               inventory.add(armor2);
               System.out.println(armor2.name + "has been successfully added to inventory");

            }
             if (currentRoom == armor && userResponse.equals("EXAMINE JAVELIN") || currentRoom == armor && userResponse.equals("EXAMINE GOLD JAVELIN") ){ 
                System.out.println(armor3.desc);
             }
             if (currentRoom == armor && userResponse.equals("STEAL JAVELIN") || currentRoom == armor && userResponse.equals("STEAL GOLD JAVELIN") ){ 
               System.out.println("Stealing Javelin...");
               armorList.remove(armor3);
               inventory.add(armor3);
               System.out.println(armor3.name + "has been successfully added to inventory");
            }
             if (currentRoom == armor && userResponse.equals("GO NORTH")){
                System.out.println("\nYou are now going north! Heading back towards the " + historic);
                currentRoom = historic;
                userResponse = userInput.nextLine().toUpperCase();
             }
             if (currentRoom == armor && userResponse.equals("GO WEST")){
                System.out.println("\nYou are now going west! Heading back towards the " + sculpture);
                currentRoom = sculpture;
                userResponse = userInput.nextLine().toUpperCase();

             }
             if (currentRoom == armor && userResponse.equals("GO SOUTH")){
               System.out.println("\n You have now entered the Hall or Animals, as you turn to your left you hear a load roar that vibrates through the room."); 
                currentRoom = Animal;
                userResponse = userInput.nextLine().toUpperCase();

             }

             
             
            



             // ************************************************
             // actions in animal will happen here
             //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
             if (currentRoom == Animal && userResponse.equals("LOOK AROUND")){
                System.out.println("\n The source of that roar? A live Triceratops!!! \n What is your next move?");
                userResponse = userInput.nextLine().toUpperCase();
                 
              }

             if (currentRoom == Animal && userResponse.equals("GO NORTH")){
                System.out.println("\nYou are now going north! Heading towards the " + armor);
                currentRoom = armor;
                userResponse = userInput.nextLine().toUpperCase();
             }
             
             // enemy fight will happen here
             

             if(currentRoom == Animal && userResponse.equals("ATTACK")){
               // only attack if sword is in inventory !
               if (inventory.contains(armor1) ){
                  Triceratops.swingSword("Triceratops");
                  System.out.println(Triceratops.health);
                  //end of game dialogue that prints out inventory 
                  System.out.println("You make your escape wit these items in your possession: " + inventory);
                     if(inventory.size() > 2){
                        System.out.println("You've collected a good profit of !"+ profit + "Have a nice time with your newly found riches");

                     } else{
                        System.out.println("Well... you didnt wuite loose but you didnt quite win either....");
                     }
               } else{
                  System.out.println("You do not have the proper gear to attack your oppponent !!");
                  System.out.println("The Triceratops rams into you with it's horns and delivers a fatal blow...");
                  stillPlaying = false;
               }
               
               
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
            // try to print out graphics of directory 
            if(userResponse.equals("DIRECTORY"))  {
              
            
               
            }                         
        } while (stillPlaying);

        //close scanner
        userInput.close();
       
        if (stillPlaying == false) {
            System.out.println("Better luck next time.");
        } 
    }

}
