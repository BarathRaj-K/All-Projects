package taxi;
import java.util.*;
public class Demo {
	static Booking booking;
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	booking = new Booking(4);
    System.out.println("\n1 for continue Booking....\n2.All Taxi Info....\n3.Taxi Info....\n4.View map\n0 for  display....");
    while(true) {
    	System.out.print("\nContinue? ");
    	char c = s.next().charAt(0);
    	if(c!='1' && c!='0'&&c!='2'&&c!='3'&&c!='4') { continue;}
    	if(c=='0') {break;}
    	if(c=='2') {booking.customerTaxiInfo();}  
    	if(c=='3') {booking.trackTaxi();}
    	if(c=='4') {booking.map();}
    	if(c=='1') {booking.Book();}}
    System.out.println("\n\n\n");
    System.out.print("--------------------------------------------------------");
    System.out.println("------------------------------------------------------");
    booking.display();
    System.out.print("--------------------------------------------------------");
    System.out.println("------------------------------------------------------");
   
}}

/*1) Design a Call taxi booking application
-There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s.
-The are 8 points(A,B,C,D,E,F,G,H)
-All the points are in a straight line, and each point is 15kms away from the adjacent points.
-It takes 60 minutes to travel from one point to another
-Each taxi charges $100 minimum for the first 5 kilometers and $10 for the subsequent kilometers.
-All taxi’s are initially stationed at A.
-When a customer books a Taxi, a free taxi at that point is allocated
-If no free taxi is available at that point, a free taxi at the nearest point is allocated.
-If two taxi’s are free at the same point, one with lower earning is allocated.
-If no taxi is free at that time, booking is rejected
  
*
*/