class Inventory {

	public void build(){
	
	System.out.println("");
	System.out.println("Building weapons...");
	
	Weapon battleAxe = new Weapon();
	battleAxe.weaponName = "Battle Axe";
	battleAxe.damageDie = "d8";
	battleAxe.cost = 7;
	battleAxe.twoHanded = true;
	battleAxe.clericUseable = false;
	battleAxe.wizardUsable = false;
	battleAxe.thiefUsable = false;
	battleAxe.dwarfUsable = true;
	battleAxe.halflingUsable = false;
	
	Weapon handAxe = new Weapon();
	handAxe.weaponName = "Hand Axe";
	handAxe.damageDie = "d6";
	battleAxe.cost = 4;
	handAxe.twoHanded = false;
	handAxe.clericUseable = false;
	handAxe.wizardUsable = false;
	handAxe.thiefUsable = true;
	handAxe.dwarfUsable = true;
	handAxe.halflingUsable = true;
	
	Weapon lightCrossBow = new Weapon();
	lightCrossBow.weaponName = "Light Crossbow";
	lightCrossBow.damageDie = "d6";
	lightCrossBow.cost = 30;
	lightCrossBow.twoHanded = true;
	lightCrossBow.clericUseable = false;
	lightCrossBow.wizardUsable = false;
	lightCrossBow.thiefUsable = true;
	lightCrossBow.dwarfUsable = true;
	lightCrossBow.halflingUsable = false;
	
	Weapon longBow = new Weapon();
	longBow.weaponName = "Longbow";
	longBow.damageDie = "d6";
	longBow.cost = 40;
	longBow.twoHanded = true;
	longBow.clericUseable = false;
	longBow.wizardUsable = false;
	longBow.thiefUsable = true;
	longBow.dwarfUsable = false;
	longBow.halflingUsable = false;
	
	Weapon shortBow = new Weapon();
	shortBow.weaponName = "Shortbow";
	shortBow.damageDie = "d6";
	shortBow.cost = 25;
	shortBow.twoHanded = true;
	shortBow.clericUseable = false;
	shortBow.wizardUsable = false;
	shortBow.thiefUsable = true;
	shortBow.dwarfUsable = true;
	shortBow.halflingUsable = true;
	
	Weapon dagger = new Weapon();
	dagger.weaponName = "Dagger";
	dagger.damageDie = "d4";
	dagger.cost = 3;
	dagger.twoHanded = false;
	dagger.clericUseable = false;
	dagger.wizardUsable = true;
	dagger.thiefUsable = true;
	dagger.dwarfUsable = true;
	dagger.halflingUsable = true;
	
	Weapon silverDagger = new Weapon();
	silverDagger.weaponName = "Silver Dagger";
	silverDagger.damageDie = "d4";
	silverDagger.specialType = "silver";
	silverDagger.cost = 30;
	silverDagger.twoHanded = false;
	silverDagger.clericUseable = false;
	silverDagger.wizardUsable = true;
	silverDagger.thiefUsable = true;
	silverDagger.dwarfUsable = true;
	silverDagger.halflingUsable = true;
	
	Weapon shortSword = new Weapon();
	shortSword.weaponName = "Short Sword";
	shortSword.damageDie = "d6";
	shortSword.cost = 7;
	shortSword.twoHanded = false;
	shortSword.clericUseable = false;
	shortSword.wizardUsable = false;
	shortSword.thiefUsable = true;
	shortSword.dwarfUsable = true;
	shortSword.halflingUsable = true;
	
	Weapon sword = new Weapon();
	sword.weaponName = "Sword";
	sword.damageDie = "d8";
	sword.cost = 10;
	sword.twoHanded = false;
	sword.clericUseable = false;
	sword.wizardUsable = false;
	sword.thiefUsable = true;
	sword.dwarfUsable = true;
	sword.halflingUsable = false;

	Weapon twoHandedSword = new Weapon();
	twoHandedSword.weaponName = "Two-Handed Sword";
	twoHandedSword.damageDie = "d10";
	twoHandedSword.cost = 15;
	twoHandedSword.twoHanded = true;
	twoHandedSword.clericUseable = false;
	twoHandedSword.wizardUsable = false;
	twoHandedSword.thiefUsable = false;
	twoHandedSword.dwarfUsable = false;
	twoHandedSword.halflingUsable = false;
	
	Weapon mace = new Weapon();
	mace.weaponName = "Mace";
	mace.damageDie = "d6";
	mace.cost = 5;
	mace.twoHanded = false;
	mace.clericUseable = true;
	mace.wizardUsable = false;
	mace.thiefUsable = true;
	mace.dwarfUsable = true;
	mace.halflingUsable = false;
	
	Weapon club = new Weapon();
	club.weaponName = "Club";
	club.damageDie = "d4";
	club.cost = 3;
	club.twoHanded = false;
	club.clericUseable = true;
	club.wizardUsable = false;
	club.thiefUsable = true;
	club.dwarfUsable = true;
	club.halflingUsable = true;
	
	Weapon polearm = new Weapon();
	polearm.weaponName = "Polearm";
	polearm.damageDie = "d10";
	polearm.cost = 7;
	polearm.twoHanded = true;
	polearm.clericUseable = false;
	polearm.wizardUsable = false;
	polearm.thiefUsable = false;
	polearm.dwarfUsable = false;
	polearm.halflingUsable = false;
	
	Weapon sling = new Weapon();
	sling.weaponName = "Sling";
	sling.damageDie = "d4";
	sling.cost = 2;
	sling.twoHanded = false;
	sling.clericUseable = true;
	sling.wizardUsable = false;
	sling.thiefUsable = true;
	sling.dwarfUsable = true;
	sling.halflingUsable = true;
	
	Weapon spear = new Weapon();
	spear.weaponName = "Spear";
	spear.damageDie = "d6";
	spear.cost = 3;
	spear.twoHanded = false;
	spear.clericUseable = false;
	spear.wizardUsable = false;
	spear.thiefUsable = true;
	spear.dwarfUsable = true;
	spear.halflingUsable = false;
	
	Weapon warHammer = new Weapon();
	warHammer.weaponName = "Warhammer";
	warHammer.damageDie = "d6";
	warHammer.cost = 5;
	warHammer.twoHanded = false;
	warHammer.clericUseable = true;
	warHammer.wizardUsable = false;
	warHammer.thiefUsable = true;
	warHammer.dwarfUsable = true;
	warHammer.halflingUsable = false;
	
	System.out.println("Weapons generated.");
	System.out.println("");
	System.out.println("Building armor...");

	Armor leather = new Armor();
	leather.armorName = "Leather";
	leather.armorClass = 3;
	leather.cost = 20;
	leather.isShield = false;
	leather.clericUseable = true;
	leather.wizardUsable = false;
	leather.thiefUsable = true;
	leather.dwarfUsable = true;
	leather.halflingUsable = true;
	leather.elfUsable = true; 
	
	Armor chain = new Armor();
	chain.armorName = "Chainmail";
	chain.armorClass = 5;
	chain.cost = 40;
	chain.isShield = false;
	chain.clericUseable = true;
	chain.wizardUsable = false;
	chain.thiefUsable = false;
	chain.dwarfUsable = true;
	chain.halflingUsable = true;
	chain.elfUsable = true; 
	
	Armor plate = new Armor();
	plate.armorName = "Platemail";
	plate.armorClass = 7;
	plate.cost = 60;
	plate.isShield = false;
	plate.clericUseable = true;
	plate.wizardUsable = false;
	plate.thiefUsable = false;
	plate.dwarfUsable = true;
	plate.halflingUsable = true;
	plate.elfUsable = true;  

	Armor shield = new Armor();
	shield.armorName = "Shield";
	shield.armorClass = 1;
	shield.cost = 20;
	shield.isShield = true;
	shield.clericUseable = true;
	shield.wizardUsable = false;
	shield.thiefUsable = true;
	shield.dwarfUsable = true;
	shield.halflingUsable = true;
	shield.elfUsable = true; 
	
	System.out.println("Armor generated.");
	System.out.println("");
	
	}



	
}