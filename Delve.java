 // ________    _______  ___  ___      ___  _______  
// |"      "\  /"     "||"  ||"  \    /"  |/"     "| 
// (.  ___  :)(: ______)||  | \   \  //  /(: ______) 
// |: \   ) || \/    |  |:  |  \\  \/. ./  \/    |   
// (| (___\ || // ___)_  \  |___\.    //   // ___)_  
// |:       :)(:      "|( \_|:  \\\   /   (:      "| 
// (________/  \_______) \_______)\__/     \_______) 

// Adventures in the Deep						  
// By Timothy O'Brien
// Build 1.00b

//This represents my attempt to put the original D&D red box rules into a JAVA 
//program.  When complete it will allow a single adventurer to play through a
//pregenerated dungeon. 


import java.util.Random;

class Delve {

	public static void main (String [] arguments) {
		System.out.println("Welcome to Delve");
		System.out.println("Written by T. O'Brien");
		System.out.println("");
		System.out.println("");
		System.out.println("Starting up True20 Engine!");
		System.out.println("Powered by your Imagination.");
		System.out.println("");
		System.out.println("");
		System.out.println("Loading the Adventure");
		System.out.println("");
		System.out.println("Initializing starting inventory...");
		Inventory shop = new Inventory();
		shop.build();
		System.out.println("Generating Starting Character");
		PC Rolf = new PC();
		Rolf.buildCharacter();
		Rolf.showCharacter();
		System.out.println("");
                Combat ambush = new Combat();
		System.out.println("You are ambushed by a goblin in the first room!");
		System.out.println("What do you do?");
                ambush.determineIntent();
                ambush.combatLoop();
	}		
}
		
		