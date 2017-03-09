import java.io.Console;

class Combat extends PC {

	
	static int enemyDamageRoll;
	static int pcDamageRoll;
	static int playerInitiative;
	static int enemyInitiative;
	static int enemyAttackRoll;
	static int pcAttackRoll;
	static int morale;
	static int movement;
	static int status;
	static int playerArmorValue;
	static int enemyArmorValue;
	static int pcBAB;
	static int enemyBAB;
	
	static boolean isAlive;
	static boolean playerGoesFirst;
	static boolean willAttack;
	
	static String PC;
	static String enemyName1;
	static String enemyName2;
	static String enemyName3;
	static String enemyName4;
	static String enemyName5;
	
        
                public void determineIntent() {
                    Console console = System.console();
                    System.out.println("Attack or Flee?");
                    String intent = console.readLine("Player: ");
                    intent.toLowerCase();
					
                    if (intent.equals("attack"))
                        willAttack = true;
                            if (intent.equals("flee"))
                                willAttack = false;
                        
                    System.out.println("You have chosen to " + intent);
                        
                }
        
		public void getInitiative (int dexBonus) {
			System.out.println("Determining Initiative...");
			DieRoller playerRoller = new DieRoller();
			DieRoller enemyRoller = new DieRoller();
			playerInitiative = playerRoller.rollSix(dexBonus);
			enemyInitiative = enemyRoller.rollSix(0);
			if (playerInitiative > enemyInitiative)
			System.out.println("You go first!");
				else
				System.out.println("Your enemy strikes first!");
				
			if (playerInitiative > enemyInitiative)
			playerGoesFirst = true;
				else
				playerGoesFirst = false;
			System.out.println("");			
		}


		public void meleeCombat (int strBonus) {
		        System.out.println("");
			DieRoller playerRoller = new DieRoller();
			DieRoller enemyRoller = new DieRoller();
			playerArmorValue = 15;
			enemyArmorValue = 11;
			pcBAB = 1;
			enemyBAB = 0;
			pcAttackRoll = playerRoller.rollTwenty(strBonus) + pcBAB;
			enemyAttackRoll = enemyRoller.rollTwenty(0) + enemyBAB;
			pcDamageRoll = playerRoller.rollEight(strBonus);
			enemyDamageRoll = enemyRoller.rollSix(0);
			
			if (playerGoesFirst == false)
				if (enemyAttackRoll > playerArmorValue)
				System.out.println("You've been hit!");
					else
					System.out.println("Whoa, that was close, they miss!");
				else
					if (pcAttackRoll > enemyArmorValue)
					System.out.println("You've hit them!");
						else
						System.out.println("You missed them!");
			
			if (playerGoesFirst == false)
				if (enemyAttackRoll > playerArmorValue)
				System.out.println("You take damage! HP left: " + (hp - enemyDamageRoll));
			
			if (playerGoesFirst == true)
				if (pcAttackRoll > enemyArmorValue)
				System.out.println("You deal damage: " + pcDamageRoll);
			
		}
                
                public void combatLoop () {
                    
                    while (willAttack == true) {
                        getInitiative(0);
                        meleeCombat(2);
                        determineIntent();
                    }
                }
}