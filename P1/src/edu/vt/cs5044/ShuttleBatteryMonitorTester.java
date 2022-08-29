package edu.vt.cs5044;

/**
 * CS 5044 Project 1
 * 
 * @author Shannon Smith (shae1223)
 * @version 2022.05.28
 */

//CHECKSTYLE:OFF
@SuppressWarnings("javadoc")
public class ShuttleBatteryMonitorTester {

    public static void main(String... args) {
        System.out.println("P1 Tester (Summer 2022)");

        ShuttleBatteryMonitor sbm = new ShuttleBatteryMonitor(9, 8, 12, 4500);
        sbm.travelTo(5);
        sbm.loadPassengers(3);
        sbm.travelTo(9);
        sbm.loadPassengers(1);
        sbm.loadPassengers(1);
        sbm.travelTo(18);

        System.out.println();
        System.out.println("Sample Test Case - Part 1 Results");
        System.out.println("  Scenario: sbm(9,8,12,4500)t(5)l(3)t(9)l(1)l(1)t(18)");
        System.out.println("Loc     expected: 18;    actual: " + sbm.getLocation());
        System.out.println("#Pass   expected: 5;     actual: " + sbm.getPassengerCount());
        System.out.println("%Charge expected: 88.2;  actual: " + sbm.getChargeRemaining());
        System.out.println("U/T     expected: 176.0; actual: " + sbm.getAverageUsagePerTrip());
        System.out.println("#Trips  expected: 22;    actual: " + sbm.getEstimatedTripsRemaining());

        sbm.loadPassengers(-4);
        sbm.travelTo(-3,5,9);
        sbm.recharge();
        sbm.travelTo(-3);
        sbm.loadPassengers(-1);

        System.out.println();
        System.out.println("Sample Test Case - Part 2 Results");
        System.out.println("  Scenario: sbm(9,8,12,4500)l(-4)t(-3,5,9)r()t(-3)l(-1)");
        System.out.println("Loc     expected: -3;    actual: " + sbm.getLocation());
        System.out.println("#Pass   expected: 0;     actual: " + sbm.getPassengerCount());
        System.out.println("%Charge expected: 99.4;  actual: " + sbm.getChargeRemaining());
        System.out.println("U/T     expected: 128.5; actual: " + sbm.getAverageUsagePerTrip());
        System.out.println("#Trips  expected: 34;    actual: " + sbm.getEstimatedTripsRemaining());
        
        sbm.loadPassengers(3);
        sbm.travelTo(-12,5,9);
        sbm.loadPassengers(1);
        sbm.travelTo(9);
        sbm.loadPassengers(-1);
        sbm.loadPassengers(-2);
        sbm.travelTo(0);

        System.out.println();
        System.out.println("Sample Test Case - Part 3 Results");
        System.out.println("  Scenario: sbm(9,8,12,4500)l(3)t(-12,5,9)l(1)t(9)l(-1)l(-2)t(0)");
        System.out.println("Loc     expected: 0;     actual: " + sbm.getLocation());
        System.out.println("#Pass   expected: 1;     actual: " + sbm.getPassengerCount());
        System.out.println("%Charge expected: 71.8;  actual: " + sbm.getChargeRemaining());
        System.out.println("U/T     expected: 223.3; actual: " + sbm.getAverageUsagePerTrip());
        System.out.println("#Trips  expected: 14;    actual: " + sbm.getEstimatedTripsRemaining());
                
        sbm.travelTo(-12);
        sbm.loadPassengers(7);
        sbm.loadPassengers(-2);
        sbm.recharge();
        sbm.travelTo(9,5,9);
        sbm.loadPassengers(-3);
        sbm.loadPassengers(2);
        sbm.travelTo(13);

        System.out.println();
        System.out.println("Sample Test Case - Part 4 Results");
        System.out.println("  Scenario: sbm(9,8,12,4500)t(-12)l(7)l(-2)r()t(9,5,9)l(-3)l(2)t(13)");
        System.out.println("Loc     expected: 13;    actual: " + sbm.getLocation());
        System.out.println("#Pass   expected: 5;     actual: " + sbm.getPassengerCount());
        System.out.println("%Charge expected: 85.2;  actual: " + sbm.getChargeRemaining());
        System.out.println("U/T     expected: 270.4; actual: " + sbm.getAverageUsagePerTrip());
        System.out.println("#Trips  expected: 14;    actual: " + sbm.getEstimatedTripsRemaining());
        
        sbm.travelTo(9);
        sbm.loadPassengers(-3);
        sbm.travelTo(5);
        sbm.loadPassengers(1);
        sbm.travelTo(-3);

        System.out.println();
        System.out.println("Sample Test Case - Part 5 Results");
        System.out.println("  Scenario: sbm(9,8,12,4500)t(9)l(-3)t(5)l(1)t(-3)");
        System.out.println("Loc     expected: -3;    actual: " + sbm.getLocation());
        System.out.println("#Pass   expected: 3;     actual: " + sbm.getPassengerCount());
        System.out.println("%Charge expected: 74.8;  actual: " + sbm.getChargeRemaining());
        System.out.println("U/T     expected: 249.0; actual: " + sbm.getAverageUsagePerTrip());
        System.out.println("#Trips  expected: 13;    actual: " + sbm.getEstimatedTripsRemaining());
                
        sbm.travelTo(-18);
        sbm.loadPassengers(3);
        sbm.travelTo(18,11,7);
        sbm.loadPassengers(-1);
        sbm.recharge();
        sbm.travelTo(5);
        sbm.loadPassengers(2);
        sbm.travelTo(-3);
        sbm.loadPassengers(4);
        sbm.travelTo(12);
        sbm.loadPassengers(-1);
        sbm.travelTo(0);

        System.out.println();
        System.out.println("Sample Test Case - Part 6 Results");
        System.out.println("  Scenario: sbm(9,8,12,4500)t(-18)l(3)t(18,11,7)l(-1)r()t(5)l(2)t(-3)l(4)t(12)l(-1)t(0)");
        System.out.println("Loc     expected: 0;     actual: " + sbm.getLocation());
        System.out.println("#Pass   expected: 10;    actual: " + sbm.getPassengerCount());
        System.out.println("%Charge expected: 19.0;  actual: " + sbm.getChargeRemaining());
        System.out.println("U/T     expected: 465.2; actual: " + sbm.getAverageUsagePerTrip());
        System.out.println("#Trips  expected: 1;     actual: " + sbm.getEstimatedTripsRemaining());
    }
}

