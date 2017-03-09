// DieRoller for D&D Basic System
// Written by Timothy O'Brien
// version 0.01b

// import needed classes

import java.util.Random;

// begin die roller class

public class DieRoller {

static int modifiedD4;
static int modifiedD6;
static int modifiedD8;
static int modifiedD10;
static int modifiedD12;
static int modifiedD20;
static int modifiedD100;

	// roll a d4, accept modifiers as an argument, always call with an int!
	  public int rollFour (int dieModifier) {
	  Random d4 = new Random();
	  int rolld4 = d4.nextInt(4);
	  modifiedD4 = (rolld4 + dieModifier);
	  if (modifiedD4 == 0){
	  modifiedD4 = 1;}
	  return (modifiedD4);	  
	  }
	  
	  // roll a d6, accept modifiers as an argument, always call with an int!
	  public int rollSix (int dieModifier) {
	  Random d6 = new Random( );
	  int rolld6 = d6.nextInt(6);
	  modifiedD6 = (rolld6 + dieModifier);
	  if (modifiedD6 == 0){
	  modifiedD6 = 1;}
	  return (modifiedD6);
	  }
	  
	  // roll a d8, accept modifiers as an argument, always call with an int!
	  public int rollEight (int dieModifier) {
	  Random d8 = new Random();
	  int rolld8 = d8.nextInt(8);
	  modifiedD8 = (rolld8 + dieModifier);
	  if (modifiedD8 == 0){
	  modifiedD8 = 1;}
	  return (modifiedD8);
	  }
	  
	  // roll a d10, accept modifiers as an argument, always call with an int!
	  public int rollTen (int dieModifier) {
	  Random d10 = new Random();
	  int rolld10 = d10.nextInt(10);
	  modifiedD10 = (rolld10 + dieModifier);
	  if (modifiedD10 == 0){
	  modifiedD10 = 1;}
	  return (modifiedD10);
	  }
	  
	  // roll a d12, accept modifiers as an argument, always call with an int!
	  public int rollTwelve (int dieModifier) {
	  Random d12 = new Random();
	  int rolld12 = d12.nextInt(12);
	  modifiedD12 = (rolld12 + dieModifier);
	  if (modifiedD12 == 0){
	  modifiedD12 = 1;}
	  return (modifiedD12);
	  }
	  
	  // roll a d20, accept modifiers as an argument, always call with an int!
	  public int rollTwenty (int dieModifier) {
	  Random d20 = new Random();
          int rolld20 = d20.nextInt(20);
	  modifiedD20 = (rolld20 + dieModifier);
	  if (modifiedD20 == 0){
	  modifiedD20 = 1;}
	  return (modifiedD20);
	  }
	  
	  // roll a d100, accept modifiers as an argument, always call with an int!
	  public int rollPercentile (int dieModifier) {
	  Random d100 = new Random();
          int rolld100 = d100.nextInt(100);
	  modifiedD100 = (rolld100 + dieModifier);
	  if (modifiedD100 == 0){
	  modifiedD100 = 1;}
	  return (modifiedD100);
	  }
	  
	  // display current values in die-roller
	  public void showDieResults() {
	  System.out.println("Result of d4: " + modifiedD4);
	  System.out.println("Result of d6: " + modifiedD6);
	  System.out.println("Result of d8: " + modifiedD8);
	  System.out.println("Result of d10: " + modifiedD10);
	  System.out.println("Result of d12: " + modifiedD12);
	  System.out.println("Result of d20: " + modifiedD20);
	  System.out.println("Result of d100: " + modifiedD100);
	  }
}
