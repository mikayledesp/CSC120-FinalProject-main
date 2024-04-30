import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import com.google.common.graph.*;

public class museum {

   public static Room currentRoom;
   public static int profit;

   // addition of rooms in musuem
   public static Room portrait = new Room("Portrait Gallery"," This gallery houses portraits across all eras of art history", 0);
   public static Room apothacary = new Room("Old Apothacary Exhibit "," This Old Apothacary is home to a variety of ancient potions and gadgets", 2);
   public static Room historic = new Room("Historical House", " This Historic House dates all the way back to 1970!",2);
   public static Room sculpture = new Room("Sculpture Garden"," This Scultpure Garden has very life like pieces, some even too life like.", 2);
   public static Room armor = new Room("Armor and Weapons Gallery"," This exhibit hosts a multitude of medival swords and shields. It also has the finest chain mill in the west, this  armor that was essential for any battle. ",3);
   public static Room Animal = new Room("Animal Exhibit",
         " This exhibit is home to the largest T-Rex! It's skeleton towers 12 feet in the air! ", 1);

   public museum() {

      ImmutableGraph<Room> myGraph1 = GraphBuilder.undirected()
            .<Room>immutable()
            .putEdge(portrait, apothacary)
            .putEdge(apothacary, historic)
            .putEdge(apothacary, sculpture)
            .putEdge(historic, sculpture)
            .putEdge(sculpture, armor)
            .putEdge(armor, Animal)
            .build();

   }

   public static void main(String[] args) {

      // addition of artifacts to portrait
      ArrayList<Artifact> portraitList = new ArrayList<>();
      Artifact portrait1 = new Artifact("\nGirl with a Pearl Earring",
            " A 1665 portrait by Joahnnes Vermeer that emphasizes the Dutch master’s ability to capture light and emotion",
            20);
      Artifact portrait2 = new Artifact("\nSelf-Portrait with Cropped Hair",
            " A 1940 self-portrait by Frida Kahlo right after her divorce from Diego Rivera. She abandoned her feminine image, expressing her own independence and separation from men",
            40);
      Artifact portrait3 = new Artifact("\nMona Lisa",
            " A 1503-1506 portrait known as a masterpiece of the Italian Renaissance and a piece of intrigue due to the subject’s enigmatic expression",
            40);
      portraitList.add(portrait1);
      portraitList.add(portrait2);
      portraitList.add(portrait3);

      // addition of artifacts to apothacary
      ArrayList<Artifact> apothacaryList = new ArrayList<>();
      // changed it so that pearl earring resides in the historic house instead
      // becuase it makes little more sense narratively
      Artifact apothacary2 = new Artifact("Old Scissors", "Add later", 5);
      apothacaryList.add(apothacary2);

      // addition of artifacts to house
      ArrayList<Artifact> houseList = new ArrayList<>();
      Artifact house1 = new Artifact("\nSony Walkman",
            " This vintage walkman plays actual music! It's kind a of dusty tho... ", 
            10);
      Artifact house2 = new Artifact("\nFine China Teacups",
            " A set of two Fine China Teacups that have pink and green flowers imprinted near the lip of the tea cup. ",
            50);
      Artifact house3 = new Artifact("\nPearl Tiffany & Co Necklace",
            " A Gold chain with a pearl teardrop pendant hanging from it.", 20);
      houseList.add(house1);
      houseList.add(house2);
      houseList.add(house3);

      // addition of artifacts to armor
      ArrayList<Artifact> armorList = new ArrayList<>();
      Artifact armor1 = new Artifact("\nSword With a Lapis Lazuli Encrusted Hilt", null, 50);
      Artifact armor2 = new Artifact("\nCurved Dagger with a Black Hilt", null, 20);
      Artifact armor3 = new Artifact("\nGolden Javelin ", null, 10);
      armorList.add(armor1);
      armorList.add(armor2);
      armorList.add(armor3);

      // addition of artifacts to sculpture 
      ArrayList<Artifact> sculptureList = new ArrayList<>();
      Artifact sculpture1 = new Artifact("Little Dancer of Fourteen Years", 
            "An 1880 bronze cast sculpture by Edgar Degas. The sculpture is dressed in a real bodice, tutu, and ballet slippers", 
            20); 
      Artifact sculpture2 = new Artifact("Perseus with the Head of Medusa", 
            "An 1804-06 marble statue by Antonio Canova, reflecting his admiration of the art of antiquity and the ancient masters. It depicts Perseus gazing upon Medusa’s severed head", 
            30); 
      Artifact sculpture3 = new Artifact(null, null, profit); 
      sculptureList.add(sculpture1);
      sculptureList.add(sculpture2);
      sculptureList.add(sculpture3);

      // inventory list of type Artifact
      // note : the apothacary items should proabably be added to the inventory once
      // user has entered room
      ArrayList<Artifact> inventory = new ArrayList<>();
      // inventory.add(apothacary1);
      // inventory.add(apothacary2);
      // inventory.add(house1);
      // inventory.add(armor1);

      // Enemies for different rooms are constructed bellow ↓
      Enemies Triceratops = new Enemies("Triceratops", 20, "To engage with this thing you may need a long sword ");

      // This is a "flag" to let us know when the loop should end
      boolean stillPlaying = true;

      // We'll use this to get input from the user.
      Scanner userInput = new Scanner(System.in);

      // Storage for user's responses
      String userResponse = "";

      // This could be replaced with a more interesting opening
      System.out.println("\n˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°");
      System.out.println("\n    Welcome To The Gallery Grab ");
      System.out.println("\n˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°˙✧˖°🏛 ༘ ⋆｡°");

      System.out.println(
            "\nYou, a comptetent but broke theif, have been tasked with stealing important artifacts so that you can sell them off later. Hattfield Musuem has a huge collection  of the finest jewelery and paintings the Northeast has to offer.\n  \nGOAL: steal artifacts that will get you the most profit. ");
      Room.showOptions();

      System.out.println("HINT: You may want to look around each room and examine each items before you steal them!");
      System.out.println("\nType Enter To START");

      // The do...while structure means we execute the body of the loop once before
      // checking the stopping condition
      do {
         // ************************************************
         // The stuff that happens in your game will go here
         // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
         userResponse = userInput.nextLine().toUpperCase();
         if (userResponse.equals("ENTER")) {
            System.out.println("\nYou have now entered the  " + portrait);
            currentRoom = portrait;
         }
         if (currentRoom == portrait && userResponse.equals("LOOK AROUND")) {
            System.out.println(
                  "Upon entering the Portrait Gallery you are met with dozens of faces housed in gold frames. A few paintings catch your eye:\n Girl With a Pearl Earring, The Mona Lisa and a Self-Portrait with Cropped Hair. Maybe I should examine them to get a closer look... ");
            userResponse = userInput.nextLine().toUpperCase();
         }

         // Portrait Gallery Examine
         if (currentRoom == portrait && userResponse.equals("EXAMINE GIRL WITH A PEARL EARRING")) {
            System.out.println(portrait1.desc);
            userResponse = userInput.nextLine().toUpperCase();
         }

         if (currentRoom == portrait && userResponse.equals("EXAMINE SELF-PORTRAIT WITH CROPPED HAIR")) {
            System.out.println(portrait2.desc);
            userResponse = userInput.nextLine().toUpperCase();
         }

         if (currentRoom == portrait && userResponse.equals("EXAMINE MONA LISA")) {
            System.out.println(portrait3.desc);
            userResponse = userInput.nextLine().toUpperCase();
         }

         // Portrait Gallery Steal
         if (currentRoom == portrait && userResponse.equals("STEAL GIRL WITH A PEARL EARRING")) {
            if (!inventory.contains(house3))
               System.out.println(
                     "The girl seems to be awaking. She says behind the frame, “I refuse to be taken off this wall until I am gifted a pearl pendant to match my earring. Please find it in the Museum.” It looks like stealing a painting requires additional steps.");

            else {
               System.out.println("Stealing from exhibit.....");
               inventory.remove(house3);
               System.out.println("The " + house3.name
                     + " has been removed from your inventory and given to the Girl with a Pearl Earring");
               portraitList.remove(portrait1);
               inventory.add(portrait1);
               System.out.println(portrait1.name + " has been successfully added to your inventory");
               profit += portrait1.value;
            }
         }

         if (currentRoom == portrait && userResponse.equals("STEAL SELF-PORTRAIT WITH CROPPED HAIR")
               || userResponse.equals("STEAL SELF-PORTRAIT")) {
            if (!inventory.contains(apothacary2))
               System.out.println(
                     "Frida Kahlo’s eyes seem to start blinking at you and her painted portrait opens its mouth, “You cannot take me off the wall until you deliver me a pair of scissors, I need to cut my hair.” It looks like you must keep searching around the museum if you want to steal this painting.");
            else {
               System.out.println("Stealing from exhibit...");
               inventory.remove(apothacary2);
               System.out.println(
                     "The " + apothacary2.name + " have been removed from your inventory and given to Frida Kahlo");
               portraitList.remove(portrait2);
               inventory.add(portrait2);
               System.out.println(portrait2.name + " has been successfully added to your inventory");
               profit += portrait2.value;
            }
         }

         if (currentRoom == portrait && userResponse.equals("STEAL MONA LISA")) {
            System.out.println("Stealing from exhibit.....");
            System.out.println(
                  "Uh-oh Alarms sound! Did you really think you could steal the Mona Lisa? Don't overshoot your shot!e");
            System.out.println("Game Over!");
            stillPlaying = false;
         }

         if (currentRoom == portrait && userResponse.equals("GO SOUTH")) {
            System.out.println("You are now going South! Heading towards the " + apothacary);
            currentRoom = apothacary;
            userResponse = userInput.nextLine().toUpperCase();
         }

         if (currentRoom == portrait && userResponse.equals("GO NORTH")) {
            System.out.println("ERROR: you cannot go in this direction, please try another one!");
            userResponse = userInput.nextLine().toUpperCase();
         }
         if (currentRoom == portrait && userResponse.equals("GO EAST")) {
            System.out.println("ERROR: you cannot go in this direction, please try another one!");

            userResponse = userInput.nextLine().toUpperCase();
         }
         if (currentRoom == portrait && userResponse.equals("GO WEST")) {
            System.out.println("ERROR: you cannot go in this direction, please try another one!");

            userResponse = userInput.nextLine().toUpperCase();
         }

         // ************************************************
         // actions in apothacary will happen here
         // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
         if (currentRoom == apothacary && userResponse.equals("LOOK AROUND")) {
            // System.out.println("Artifact list print out would go here");
            userResponse = userInput.nextLine().toUpperCase();

         }
         if (currentRoom == apothacary && userResponse.equals("GO NORTH")) {
            System.out.println("\nYou are now going back north! Heading towards the " + portrait);
            currentRoom = portrait;

         }
         if (currentRoom == apothacary && userResponse.equals("GO SOUTH")) {
            System.out.println("\nYou are now going south! Heading towards the " + sculpture);
            currentRoom = sculpture;

         }

         if (currentRoom == apothacary && userResponse.equals("GO EAST")) {
            System.out.println("\nYou are now going east! Heading towards the " + historic);
            currentRoom = historic;

         }

         // ************************************************
         // actions in historic house will happen here
         // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓

         if (currentRoom == historic && userResponse.equals("LOOK AROUND")) {
            System.out.println(
                  " As you head east, a small recreation of an A-frame house appears. Upon entering the house you are met with tons of vintage items from the 1970's including a Sony Walkman, a set of two Fine China Teacups and a Pearl Pendant Tiffany & Co Necklace.");

            userResponse = userInput.nextLine().toUpperCase();

         }
         if (currentRoom == historic && userResponse.equals("EXAMINE SONY WALKMAN")
               || userResponse.equals("EXAMINE WALKMAN")) {
            System.out.println(house1.desc);
            System.out.println("Hmmm.....this item may be helpful later on but it doesn't have a high value");
            System.out.println("To steal or not to steal...");
         }
         if (currentRoom == historic && userResponse.equals("STEAL SONY WALKMAN")
               || userResponse.equals("STEAL WALKMAN")) {
            houseList.remove(house1);
            inventory.add(house1);
            System.out.println("Stealing walkman...");
            profit += house1.value;
         }

         if (currentRoom == historic && userResponse.equals("EXAMINE FINE CHINA TEACUPS")
               || userResponse.equals("EXAMINE TEACUPS")) {
            System.out.println(house2.desc);
         }
         if (currentRoom == historic && userResponse.equals("STEAL FINE CHINA TEACUPS")
               || userResponse.equals("STEAL TEACUPS")) {
            houseList.remove(house2);
            inventory.add(house2);
            System.out.println("Stealing teacups...");
            profit += house2.value;
         }
         if (currentRoom == historic && userResponse.equals("EXAMINE PEARL PENDANT")
               || userResponse.equals("EXAMINE PEARL PENDANT TIFFANY & CO NECKLACE")
               || userResponse.equals("EXAMINE NECKLACE")) {
            System.out.println(house3.desc);
         }
         if (currentRoom == historic && userResponse.equals("STEAL PEARL PENDANT")
               || userResponse.equals("STEAL PEARL PENDANT TIFFANY & CO NECKLACE")
               || userResponse.equals("STEAL NECKLACE")) {
            houseList.remove(house3);
            inventory.add(house3);
            System.out.println("Stealing pearl pendant...");
            profit += house3.value;
         }

         if (currentRoom == historic && userResponse.equals("GO WEST")) {
            System.out.println("\nYou are now going west! Heading back towards the " + apothacary);
            currentRoom = apothacary;

         }
         if (currentRoom == historic && userResponse.equals("GO SOUTH")) {
            System.out.println("\nYou are now going south! Heading towards the " + armor);
            currentRoom = armor;

         }

         // ************************************************
         // actions in sculpture exhibit will happen here
         // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
         if (currentRoom == sculpture && userResponse.equals("LOOK AROUND")) {
            System.out.println("Upon entering the " + sculpture.name + " you are met with cold marble stares. A few of the statues catch your eye: \n The Little Dancer of Fourteen Years, Perseus with the Head of Medusa, and ____. Examine them if you hope to learn more.");

            userResponse = userInput.nextLine().toUpperCase();

         }

         // Sculpture Garden Examine
         if (currentRoom == sculpture && userResponse.equals("EXAMINE LITTLE DANCER OF FOURTEEN YEARS") 
            || userResponse.equals("EXAMINE LITTLE DANCER")) {
            System.out.println(sculpture1.desc);
            userResponse = userInput.nextLine().toUpperCase();
         }

         if (currentRoom == sculpture && userResponse.equals("EXAMINE PERSEUS WITH THE HEAD OF MEDUSA")
            || userResponse.equals("EXAMINE PERSEUS")) {
            System.out.println(sculpture2.desc);
            userResponse = userInput.nextLine().toUpperCase();
         }

         if (currentRoom == sculpture && userResponse.equals("EXAMINE null")) {
            System.out.println(sculpture3.desc);
            userResponse = userInput.nextLine().toUpperCase();
         }


         // Sculpture Garden Steal
         if (currentRoom == sculpture && userResponse.equals("STEAL LITTLE DANCER OF FOURTEEN YEARS") 
            || userResponse.equals("STEAL LITTLE DANCER")) {
            if (!inventory.contains(house1))
               System.out.println(
                  "The young dancer begins to move her bronze limbs and she says, “You must not remove me from this gallery until I can dance my final dance, but first I need music.” Where will you find music in the Museum?");

            else {
               System.out.println("Stealing from exhibit.....");
               inventory.remove(house1);
               System.out.println("The " + house1.name + " has been removed from your inventory and given to the Little Dancer of Fourteen Years.");
               sculptureList.remove(sculpture1);
               inventory.add(sculpture1);
               System.out.println(sculpture1.name + " has been successfully added to your inventory");
               profit += sculpture1.value;
            }
         }

         if (currentRoom == sculpture && userResponse.equals("STEAL PERSEUS WITH THE HEAD OF MEDUSA")
               || userResponse.equals("STEAL PERSEUS")) {
            System.out.println("It looks like Perseus won't be stolen so he easily. He has a knife, and seems to be approaching to attack you. Do you have a weapon to fight back? ");
            
            if (inventory.contains(armor1) ) {
               System.out.println("You have " + armor1.name + "in your inventory. You must use it to fight Perseus, otherwise you will die.");
               inventory.remove(armor1);
               System.out.println("You have defeated Perseus with the Head of Medua. The " + armor1.name + "has been removed from your inventory.");
               inventory.add(sculpture2);
               System.out.println(sculpture2.name + " has been successfully added to your inventory");
               profit += sculpture2.value; 
            }
            else if (inventory.contains(armor2)){
               System.out.println("You have " + armor2.name + "in your inventory. You must use it to fight Perseus, otherwise you will die.");
               inventory.remove(armor2);
               System.out.println("You have defeated Perseus with the Head of Medua. The " + armor2.name + "has been removed from your inventory.");
               inventory.add(sculpture2);
               System.out.println(sculpture2.name + " has been successfully added to your inventory");
               profit += sculpture2.value;
            }
            else if (inventory.contains(armor3)){
               System.out.println("You have " + armor3.name + "in your inventory. You must use it to fight Perseus, otherwise you will die.");
               inventory.remove(armor3);
               System.out.println("You have defeated Perseus with the Head of Medua. The " + armor3.name + "has been removed from your inventory.");
               inventory.add(sculpture2);
               System.out.println(sculpture2.name + " has been successfully added to your inventory");
               profit += sculpture2.value;
            }
            else {
               System.out.println("Uh-oh! It looks like you have no way to defend yoursel");
               System.out.println("Game Over!");
               stillPlaying = false;  
            }
         }
         


         if (currentRoom == sculpture && userResponse.equals("GO NORTH")) {
            System.out.println("\nYou are now going north! Heading towards the " + apothacary);
            currentRoom = apothacary;

         }
         if (currentRoom == sculpture && userResponse.equals("GO EAST")) {
            System.out.println("\nYou are now going east! Heading towards the " + armor);
            currentRoom = armor;

         }

         // ************************************************
         // actions in armor exhibit will happen here
         // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
         if (currentRoom == armor && userResponse.equals("LOOK AROUND")) {
            System.out.println(
                  "Upon entering the dimily lit armory you see many swords and daggers hanging neatly from the walls! A few of them catch your eye: A Sword With a Lapus Encrusted Hilt, A curved Dagger with a Black Hilt and, a Golden Javelin  ");
            userResponse = userInput.nextLine().toUpperCase();
         }
         if (currentRoom == armor && userResponse.equals("EXAMINE SWORD")
               || currentRoom == armor && userResponse.equals("EXAMINE SWORD WITH A LAPIS LAZULI ENCRUSTED HILT")) {
            System.out.println(armor1.desc);
         }
         if (currentRoom == armor && userResponse.equals("STEAL SWORD")
               || currentRoom == armor && userResponse.equals("STEAL SWORD WITH A LAPIS LAZULI ENCRUSTED HILT")) {
            System.out.println("Stealing Sword...");
            armorList.remove(armor1);
            inventory.add(armor1);
            System.out.println(armor1.name + "has been successfully added to inventory");
            profit += armor1.value;
         }
         if (currentRoom == armor && userResponse.equals("EXAMINE DAGGER")
               || currentRoom == armor && userResponse.equals("EXAMINE CURVED DAGGER WITH A BLACK HILT")) {
            System.out.println(armor2.desc);
         }
         if (currentRoom == armor && userResponse.equals("STEAL DAGGER")
               || currentRoom == armor && userResponse.equals("STEAL CURVED DAGGER WITH A BLACK HILT")) {
            System.out.println("Stealing Dagger....");
            armorList.remove(armor2);
            inventory.add(armor2);
            System.out.println(armor2.name + "has been successfully added to inventory");
            profit += armor2.value;

         }
         if (currentRoom == armor && userResponse.equals("EXAMINE JAVELIN")
               || currentRoom == armor && userResponse.equals("EXAMINE GOLD JAVELIN")) {
            System.out.println(armor3.desc);
         }
         if (currentRoom == armor && userResponse.equals("STEAL JAVELIN")
               || currentRoom == armor && userResponse.equals("STEAL GOLD JAVELIN")) {
            System.out.println("Stealing Javelin...");
            armorList.remove(armor3);
            inventory.add(armor3);
            System.out.println(armor3.name + "has been successfully added to inventory");
            profit += armor3.value;
         }
         if (currentRoom == armor && userResponse.equals("GO NORTH")) {
            System.out.println("\nYou are now going north! Heading back towards the " + historic);
            currentRoom = historic;

         }
         if (currentRoom == armor && userResponse.equals("GO WEST")) {
            System.out.println("\nYou are now going west! Heading back towards the " + sculpture);
            currentRoom = sculpture;

         }
         if (currentRoom == armor && userResponse.equals("GO SOUTH")) {
            System.out.println(
                  "\n You have now entered the Hall or Animals, as you turn to your left you hear a load roar that vibrates through the room.");
            currentRoom = Animal;

         }

         // ************************************************
         // actions in animal will happen here
         // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
         if (currentRoom == Animal && userResponse.equals("LOOK AROUND")) {
            System.out.println(
                  "\n The source of that roar? A live Triceratops!!! \n Specify the weapon you will use to attack!");
            userResponse = userInput.nextLine().toUpperCase();

         }

         if (currentRoom == Animal && userResponse.equals("GO NORTH")) {
            System.out.println("\nYou are now going north! Heading towards the " + armor);
            currentRoom = armor;

         }

         if (currentRoom == Animal && userResponse.equals("ATTACK WITH DAGGER")) {
            System.out.println("What is a dagger going to do against a dinosaur...");
            System.out.println("You do not have the proper gear to attack your oppponent !!");
            System.out.println("The Triceratops rams into you with it's horns and delivers a fatal blow...");
            stillPlaying = false;
         }
         // if player chooses to attack with a sword
         if (currentRoom == Animal && userResponse.equals("ATTACK WITH SWORD")) {
            // only attack if sword is in inventory !
            if (inventory.contains(armor1)) {
               Triceratops.health -= 10;
               System.out.println(Triceratops.health);
               System.out.println("Effective Strike! However the beast still thrives, you may need to attack again.");
               userResponse = userInput.nextLine().toUpperCase();
               if (Triceratops.health > 0) {
                  System.out.println(Triceratops.health);
                  if (userResponse.equals("ATTACK WITH SWORD") || userResponse.equals("ATTACK AGAIN")) {
                     Triceratops.health -= 10;
                     System.out.println(Triceratops.health);

                  }
                  if (Triceratops.health == 0) {
                     System.out.println("You've defeated the beast!");
                     System.out.println("Now, go onward to make your escape!");
                     System.out.println("\nYou make your escape wit these items in your possession: " + inventory);
                     if (inventory.size() > 2) {
                        System.out.println("\nYou've collected a good profit of !" + profit + "Have a nice time with your newly found riches");

                     } else {
                        System.out.println("\nWell... you didnt quite loose but you didnt quite win either....");
                     }
                  }
               }

               

            } else {
               System.out.println("You do not have the proper gear to attack your oppponent !!");
               System.out.println("The Triceratops rams into you with it's horns and delivers a fatal blow...");
               stillPlaying = false;
            }

         }

         // strings that work across all rooms
         if (userResponse.equals("WHAT ROOM AM I IN")) {
            System.out.println(currentRoom);
         }
         if (userResponse.equals("INVENTORY")) {
            System.out.println(inventory);
         }
         if (userResponse.equals("HELP") || (userResponse.equals("?"))) {
            Room.showOptions();
            userResponse = userInput.nextLine().toUpperCase();
         }
         if (userResponse.equals("CHECK PROFIT")) {
            System.out.println("$" + profit);
         }
         // try to print out graphics of directory
         if (userResponse.equals("DIRECTORY")) {

         }
      } while (stillPlaying);

      // close scanner
      userInput.close();

      if (stillPlaying == false) {
         System.out.println("Better luck next time.");
      }

   }

}
