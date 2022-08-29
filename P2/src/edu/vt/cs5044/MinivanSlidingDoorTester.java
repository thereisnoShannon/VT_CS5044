package edu.vt.cs5044;

/**
 * CS 5044 Project 2
 * 
 * @author Shannon Smith (shae1223)
 * @version 2022.06.13
 */

//CHECKSTYLE:OFF
@SuppressWarnings("javadoc")
public class MinivanSlidingDoorTester {

    public static void main(String... args) {
        System.out.println("P2 Minivan Sliding Door Tester (Summer 2022)");

        MinivanSlidingDoor door = new MinivanSlidingDoor();
        
        Result result = null;
        System.out.println();
    
        System.out.println("//////////////////////// INITIAL TEST PARAMETERS: CONSTRUCTOR //////////////////////////"); 
        
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        System.out.println();
        System.out.println(); 

        System.out.println("//////////////////////////////// INITIAL GEAR TESTING //////////////////////////////////"); 
        
        System.out.println();
        System.out.println("Test 1: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("------> Gear Park to Reverse");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.setGear(Gear.REVERSE);
        System.out.println("ACTION:                 Expected: GEAR_RELEASED;            Actual: " + result);
        System.out.println("GEAR:                   Expected: REVERSE;                  Actual: " + door.getGear()); 
        System.out.println();
        
        System.out.println("Test 2: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is REVERSE]");
        System.out.println("------> Gear Reverse to Neutral");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: REVERSE;                  Actual: " + door.getGear());
        result = door.setGear(Gear.NEUTRAL); 
        System.out.println("ACTION:                 Expected: GEAR_CHANGED;             Actual: " + result);
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        System.out.println();
        
        System.out.println("Test 3: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is NEUTRAL]");
        System.out.println("------> Gear Neutral to Park");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.setGear(Gear.PARK); 
        System.out.println("ACTION:                 Expected: GEAR_PARKED;              Actual: " + result);
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        System.out.println();
        
        System.out.println("Test 4: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("------> Gear Park to Park");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.setGear(Gear.PARK); 
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result);
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        System.out.println();
        
        System.out.println("Test 5: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("------> null parameter accepted by setGear");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.setGear(null); 
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER         Actual: " + result);
        System.out.println("GEAR:                   Expected: null;                     Actual: " + door.getGear());
        System.out.println();
        
        System.out.println("Test 6: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is null]");
        System.out.println("------> Gear null to Park");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: null;                     Actual: " + door.getGear()); 
        result = door.setGear(Gear.PARK); 
        System.out.println("ACTION:                 Expected: GEAR_PARKED;              Actual: " + result);
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        System.out.println(); 

        System.out.println("///////////////////////////// INITIAL CHILDSAFE TESTING ////////////////////////////////"); 
       
        System.out.println();
        System.out.println("Test 7: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]"); 
        System.out.println("------> childSafe engaged");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.setChildSafe(true); 
        System.out.println("ACTION:                 Expected: CHILDSAFE_INACCESSIBLE;   Actual: " + result);
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println();

        System.out.println("Test 8: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("------> Door Opened by Inside, then childSafe engaged, then Door Closed by Inside");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: DOOR_OPENED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        result = door.setChildSafe(true); 
        System.out.println("ACTION:                 Expected: CHILDSAFE_ENGAGED;        Actual: " + result);
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println(); 
  
        System.out.println("Test 9: setup [Door is open, Door is unlocked, ChildSafe is engaged, Gear is PARK]"); 
        System.out.println("------> childSafe engaged");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.setChildSafe(true);  
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result);
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println();
        
        System.out.println("Test 10: setup [Door is open, Door is unlocked, ChildSafe is engaged, Gear is PARK]"); 
        System.out.println("-------> childSafe disengaged");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.setChildSafe(false); 
        System.out.println("ACTION:                 Expected: CHILDSAFE_DISENGAGED;     Actual: " + result);
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        result = door.pushOutsideHandle(Direction.CLOSE); 
        System.out.println("ACTION:                 Expected: DOOR_CLOSED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
  
        System.out.println("//////////////////////////////// INITIAL LOCK TESTING //////////////////////////////////");
       
        System.out.println(); 
        System.out.println("Test 11: setup [Door is closed, Door is unlocked, ChildSafe is engaged, Gear is PARK]"); 
        System.out.println("-------> Push Unlock Button when Unlocked");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.pushUnlockButton();
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result);
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println();
        
        System.out.println("Test 12: setup [Door is closed, Door is unlocked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> Push Lock Button when Unlocked");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.pushLockButton(); 
        System.out.println("ACTION:                 Expected: DOOR_LOCKED;              Actual: " + result);;
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked()); 
        System.out.println();
        
        System.out.println("Test 13: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]"); 
        System.out.println("-------> Push Lock Button when Locked");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.pushLockButton(); 
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result);
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked()); 
        System.out.println();
        
        System.out.println("Test 14: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]"); 
        System.out.println("-------> Push Unlock Button when Locked");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        result = door.pushUnlockButton();
        System.out.println("ACTION:                 Expected: DOOR_UNLOCKED;            Actual: " + result);
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println();

        System.out.println("////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println("////// AFTER ALL INITIAL TESTING ON OPEN/CLOSE, LOCKED/UNLOCK, GEAR AND CHILDSAFE //////");
        
        System.out.println();
        System.out.println("-------> back to initial setup ------->");
        System.out.println("   [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]");
        System.out.println();
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked()); 
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear());
        System.out.println();

        System.out.println("//////////////////////////////// HANDLE OPEN / CLOSE ///////////////////////////////////");
        
        System.out.println();
        System.out.println("Test 15: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Outside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(Direction.OPEN); 
        System.out.println("ACTION:                 Expected: DOOR_OPENED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen());
        System.out.println();
        
        System.out.println();
        System.out.println("Test 16: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Outside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(Direction.OPEN); 
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen());
        System.out.println();

        System.out.println("Test 17: setup [Door is open, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Closed by Outside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: DOOR_CLOSED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());         
        System.out.println();    
        
        System.out.println();
        System.out.println("Test 18: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Dashboard Button");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushDashboardButton(Direction.OPEN); 
        System.out.println("ACTION:                 Expected: DOOR_OPENED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen());
        System.out.println();
        
        System.out.println();
        System.out.println("Test 19: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Dashboard Button");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushDashboardButton(Direction.OPEN); 
        System.out.println("ACTION:                 Expected: DOOR_OPENED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen());
        System.out.println();
        
        System.out.println("Test 20: setup [Door is open, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Closed by Dashboard Button");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushDashboardButton(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: DOOR_CLOSED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());         
        System.out.println();  
         
        System.out.println();
        System.out.println("Test 21: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Inside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN); 
        System.out.println("ACTION:                 Expected: DOOR_OPENED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen());
        System.out.println();
                
        System.out.println();
        System.out.println("Test 22: setup [Door is closed, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Inside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN); 
        System.out.println("ACTION:                 Expected: DOOR_OPENED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen());
        System.out.println();
        
        System.out.println("Test 23: setup [Door is open, Door is unlocked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Closed by Inside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: DOOR_CLOSED;              Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());         
        System.out.println();  

        System.out.println("/////////////////// DASHBOARD BUTTON WITH CHILDSAFE & GEAR ENGAGED /////////////////////");
        
        result = door.pushOutsideHandle(Direction.OPEN);
        result = door.setGear(Gear.NEUTRAL);
        
        System.out.println(); 
        System.out.println("Test 24: setup [Door is open, Door is unlocked, ChildSafe is disengaged, Gear is NEUTRAL]");
        System.out.println("-------> Door Opened by Dashboard Button");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.pushDashboardButton(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_GEAR;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());         
        System.out.println(); 
        
        System.out.println(); 
        System.out.println("Test 25: setup [Door is open, Door is unlocked, ChildSafe is disengaged, Gear is NEUTRAL]");
        System.out.println("-------> Door Opened by Outside Handle");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: true;                     Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_GEAR;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());         
        System.out.println(); 

        result = door.setGear(Gear.PARK);
        result = door.pushOutsideHandle(Direction.OPEN);
        result = door.setChildSafe(true); 
        result = door.setGear(Gear.NEUTRAL);
        result = door.pushLockButton(); 
        result = door.pushOutsideHandle(Direction.CLOSE);
        
     
        System.out.println();
        System.out.println("Test 26: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is NEUTRAL]");
        System.out.println("-------> Door Opened by Dashboard Button, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.pushDashboardButton(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_GEAR;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushDashboardButton(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
        
        result = door.setGear(Gear.PARK); 
        result = door.pushLockButton(); 
        
        System.out.println("Test 27: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Dashboard Button, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushDashboardButton(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_LOCK;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushDashboardButton(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
         
        System.out.println("Test 28: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> null by Dashboard Button, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushDashboardButton(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushDashboardButton(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
       
        System.out.println("//////////////////// OUTSIDE HANDLE WITH CHILDSAFE & GEAR ENGAGED //////////////////////");

        result = door.pushOutsideHandle(Direction.OPEN);
        result = door.setChildSafe(true); 
        result = door.setGear(Gear.NEUTRAL);
        result = door.pushLockButton(); 
        result = door.pushOutsideHandle(Direction.CLOSE);
          
        System.out.println();
        System.out.println("Test 29: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is NEUTRAL]");
        System.out.println("-------> Door Opened by Outside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_GEAR;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushOutsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
        
        result = door.setGear(Gear.PARK); 
        result = door.pushLockButton(); 
        
        System.out.println("Test 30: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Outside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_LOCK;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushOutsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
        
        System.out.println("Test 31: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> null by Outside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushOutsideHandle(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushOutsideHandle(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
          
        System.out.println("///////////////////// INSIDE HANDLE WITH CHILDSAFE & GEAR ENGAGED //////////////////////");

        result = door.pushOutsideHandle(Direction.OPEN); 
        result = door.setChildSafe(true); 
        result = door.setGear(Gear.NEUTRAL);
        result = door.pushLockButton(); 
        result = door.pushOutsideHandle(Direction.CLOSE);
           
        System.out.println();
        System.out.println("Test 32: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is NEUTRAL]");
        System.out.println("-------> Door Opened by Inside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_CHILDSAFE    Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushInsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
        
        result = door.setGear(Gear.PARK); 
        result = door.pushUnlockButton(); 
        
        System.out.println("Test 33: setup [Door is closed, Door is unlocked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Inside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_CHILDSAFE    Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushInsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
         
        System.out.println("Test 34: setup [Door is closed, Door is locked, ChildSafe is engaged, Gear is PARK]");
        System.out.println("-------> null by Inside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: false;                    Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: true;                     Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushInsideHandle(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
        
        result = door.pushOutsideHandle(Direction.OPEN); 
        result = door.setChildSafe(false); 
        result = door.setGear(Gear.NEUTRAL);
        result = door.pushOutsideHandle(Direction.CLOSE);
        result = door.pushLockButton(); 
        
        System.out.println();
        System.out.println("Test 35: setup [Door is closed, Door is locked, ChildSafe is disengaged, Gear is NEUTRAL]");
        System.out.println("-------> Door Opened by Inside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: NEUTRAL;                  Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_GEAR;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushInsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
        
        result = door.setGear(Gear.PARK);  
        result = door.pushLockButton();  
        
        System.out.println("Test 36: setup [Door is closed, Door is locked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> Door Opened by Inside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(Direction.OPEN);
        System.out.println("ACTION:                 Expected: OPEN_REFUSED_LOCK;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushInsideHandle(Direction.CLOSE);
        System.out.println("ACTION:                 Expected: NO_ACTION;                Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();
         
        System.out.println("Test 37: setup [Door is closed, Door is locked, ChildSafe is disengaged, Gear is PARK]");
        System.out.println("-------> null by Inside Handle, then Closed");
        System.out.println(); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen()); 
        System.out.println("DOOR LOCKED:            Expected: true;                     Actual: " + door.isLocked());
        System.out.println("CHILDSAFE:              Expected: false;                    Actual: " + door.isChildSafe());
        System.out.println("GEAR:                   Expected: PARK;                     Actual: " + door.getGear()); 
        result = door.pushInsideHandle(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        result = door.pushInsideHandle(null);
        System.out.println("ACTION:                 Expected: INVALID_PARAMETER;        Actual: " + result); 
        System.out.println("DOOR OPEN:              Expected: false;                    Actual: " + door.isOpen());
        System.out.println();

    } 
}      
 