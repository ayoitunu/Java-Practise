package chapter7.exercise7_21;

import java.util.Scanner;

public class TurtleGraphicTest {
	
	public static void main(String [] args) {
		
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose Turtle activity: ");
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1 Pen up"
								,"2 Pen down"
								,"3 Turn right"
								,"4 Turn left"
								,"5,10 Move forward"
								,"6 Display board"
								,"9 End of data");
		
		int choice = input.nextInt();
		
		while(choice != 9) {
		
			switch(choice) {
			
			case 1:
				TurtleGraphic.penUp();
				break;
			case 2:
				TurtleGraphic.penDown();
				break;
			case 3:
				TurtleGraphic.turnRight();
				break;
			case 4:
				TurtleGraphic.turnLeft();
				break;
			case 5:
				System.out.println("Enter number of move");
				int move = input.nextInt();
				TurtleGraphic.turtleMovement(move);
				break;
			case 6:
				TurtleGraphic.displayBoard();
				break;
			case 9:
				System.out.println("Turtle takes a nap");
				
			}
			TurtleGraphic.currentPosition();
			System.out.println();
			choice = input.nextInt();
		
		}
		
		
	}
	

}
