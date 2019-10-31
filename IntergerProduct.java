/**
 * 
 */
package chapter7.exercise7_14;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class IntergerProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		
		System.out.printf("Enter number of times ");
		int noOfTimes = input.nextInt();
		
		int [] array = new int[noOfTimes];
		
		for(int count = 0; count < array.length; count++ ) {
			
			int x = input.nextInt();
			array[count] = x;

		}
		System.out.printf("The product is: %d", calProduct(array));

	}
	
	public static int calProduct(int...integers) {
		
		int total = 1;
		
		for(int x : integers) {
			total *= x;
			//System.out.println(total);
		}
		return total;

	}
	

}
