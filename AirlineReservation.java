///**
// * 
// */
//package chapter7.exercise7_19;
//
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * @author USER
// *
// */
//public class AirlineReservation {
//	
//
//		static boolean [] airlineSeats = new boolean[11];
//		static Scanner in = new Scanner(System.in);
//		static Random atRandom = new Random();
//
//
//		private enum Status {Sold, Yes};
//
//		public boolean assignFirstClass() {
//			boolean book;
//			for(int seats = 0; seats < 5; seats++) {
//				book = airlineSeats[seats]; 
//				if(book == false) {
//					System.out.printf("%s%n%s[%02d]%n%s%n%n","BOARDING PASS","Seat No is: ", seats + 1, "Section: First-class");
//					airlineSeats[seats] = true;
//					return true;
//				}
//
//			}
//			return false;
//
//		}
//		public boolean bookEconomy() {
//			boolean book; 
//			for(int seats = 5; seats < 11; seats++ ) {
//				book = airlineSeats[seats];
//				if(book == false) {
//					System.out.printf("%s%n%s[%02d]%n%s%n%n","BOARDING PASS","Seat No is: ", seats , "Section: Economy-class");
//					airlineSeats[seats] = true;
//					return true;
//				}
//			}
//			return false;
//		}
//
//		public void assignSeats() {
//			int customer = 0;
//			boolean check;
//			char option = 'y';
//
//			Status allSeats = availableSeats();
//			System.out.println("Welcome to Arik Air!");
//			while(allSeats == Status.Yes) {
//
//				System.out.println("Please type 1 for First Class and type 2 for Economy.");
////				try {
//				customer = in.nextInt();
////				}
////				catch(InputMismatchException e) {
////					System.out.println("Please type 1 for First Class and type 2 for Economy.");
////				}
//			if(customer == 1) {									//assign appropriate seats
//				check = assignFirstClass();
//				if(check == true) {
//					System.out.println("Thank You!\n");
//				}
//				else {//offer seat alternatives
//					System.out.println("Would you like a to be places in economy-class ?y/n");
//					try {
//						 option = in.next().charAt(0);
//					}
//				catch(InputMismatchException e) {
//					System.out.println(e);
//				}
//					if(option == 'y') {
//						check = bookEconomy();
//						if(check == true) {
//							System.out.println("Thank You!\n");
//						}
//						else 
//							System.out.println("Next Flight leaves in 3 hours\n");
//					}
//					else {
//						System.out.println("Next Flight leaves in 3 hours\n");
//					}
//				}
//			}
//			else if(customer == 2) {
//				check = bookEconomy();
//				if (check == true) {
//					System.out.println("Thank You!\n");
//				}
//				else {
//					System.out.println("Would you like to be places in first class ?y/n");
//					try {
//					 option = in.next().charAt(0);
//					}
//					catch(InputMismatchException e) {
//						System.out.println(e);
//					}
//					if(option == 'y') {
//						check = assignFirstClass();
//						if(check == true)
//						System.out.println("Thank you!\n");
//						else
//							System.out.println("Next Flight leaves in 3 hours\n");
//					}
//					else 
//						System.out.println("Next Flight leaves in 3 hours\n");
//				}
//			}
//			//check if seats are still available
//				allSeats = availableSeats();
//
//
//			}
//
//			if(allSeats == Status.Sold) {
//				System.out.println("All seats sold. Next Flight leaves in 3 hours");
//			}
//
//		}
//		public Status availableSeats() { //check if seats are still available
//
//			for(boolean flightSeats: airlineSeats) {
//				if(flightSeats == false) {
//					return Status.Yes;
//				}
//			}
//
//			return Status.Sold;
//		}
//
//}
