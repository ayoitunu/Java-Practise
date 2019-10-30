/**
 * 
 */
package Tutorial;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Seperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a five digit number: ");
		int num = input.nextInt();
		
		int remainder = 0;
		String space = " ";
		
		while(num>0) {
			remainder = num % 10;
			space = remainder+ " "+ space;
			num = num / 10;			}
		
		
		System.out.println(space);
	
	}
	
	

}
