public class PC {

static int str;
static int strBonus;
static int intel;
static int intelBonus;
static int wis;
static int wisBonus;
static int dex;
static int dexBonus;
static int con;
static int conBonus;
static int cha;
static int chaBonus;
static int svPosion;
static int svMagicWand;
static int svPetraPara;
static int svDragonB;
static int svSpells;
static int hp;
static int armorClass;
static int level;
static long exp;

static String pcClass;
static String alignment;
static String charName;

	public void buildCharacter() {
	DieRoller dieOne = new DieRoller();
	DieRoller dieTwo = new DieRoller();
	DieRoller dieThree = new DieRoller();
	str = (dieOne.rollSix(0) + dieTwo.rollSix(0) + dieThree.rollSix(0));
	intel = (dieOne.rollSix(0) + dieTwo.rollSix(0) + dieThree.rollSix(0));
	wis = (dieOne.rollSix(0) + dieTwo.rollSix(0) + dieThree.rollSix(0));
	dex = (dieOne.rollSix(0) + dieTwo.rollSix(0) + dieThree.rollSix(0));
	con = (dieOne.rollSix(0) + dieTwo.rollSix(0) + dieThree.rollSix(0));
	cha = (dieOne.rollSix(0) + dieTwo.rollSix(0) + dieThree.rollSix(0));
	charName = "Rolf da Hammer";
	pcClass = "Fighter";
	alignment = "lawful";
	level = 1;
	exp = 0;
	hp = 8 + conBonus;
	svPosion = 12;
	svMagicWand = 13;
	svPetraPara = 14;
	svDragonB = 15;
	svSpells = 16;
	
	}
	
	public void showCharacter() {
	System.out.println("");
	System.out.println("YOUR CHARACTER SHEET");
	System.out.println("Character Name: " + charName);
	System.out.println("Alignment: " + alignment);
	System.out.println("Character Class: " + pcClass);
	System.out.println("Current Level: " + level);
	System.out.println("Total Experience Earned: " + exp);
	System.out.println("Hit Points: " + hp);
	System.out.println("Armor Class: " + armorClass);
	System.out.println("");
	System.out.println("ATTRIBUTES");
	System.out.println("STR: " + str);
	System.out.println("INT: " + intel);
	System.out.println("WIS: " + wis);
	System.out.println("DEX: " + dex);
	System.out.println("CON: " + con);
	System.out.println("CHA: " + cha);
	System.out.println("");
	System.out.println("");
	System.out.println("SAVING THROWS");
	System.out.println("vs. Poison: " + svPosion);
	System.out.println("vs. Magic Wand: " + svMagicWand);
	System.out.println("vs. Paralysis/Petrafication: " + svPetraPara);
	System.out.println("vs. Dragon Breath: " + svDragonB);
	System.out.println("vs. Rod, Staves, Spells: " + svSpells);
	}
	
}