/**
 * 
 */
package chapter6.exercise6_21;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Test {

	/**
	 * @param args
	 * 
	 */
	public String seperateNumbers(int number) {
		
		int remainder = 0;
		String seperated = " ";
		
		while(number>0) {
			remainder = number % 10;
			seperated = remainder+ " " +seperated;
			number = number/10;
			
		}
		return seperated;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test num = new Test();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		System.out.println(num.seperateNumbers(number));
		
		
	

	}

}
